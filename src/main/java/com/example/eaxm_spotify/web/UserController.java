package com.example.eaxm_spotify.web;

import com.example.eaxm_spotify.model.dto.UserLoginDto;
import com.example.eaxm_spotify.model.dto.UserRegisterDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/register")
    public String register(){

        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid UserRegisterDto userRegisterDto, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors() ||! userRegisterDto.getPassword().equals(userRegisterDto.getConfirmPassword())){
            redirectAttributes.addAttribute("userRegisterDto",userRegisterDto);
            redirectAttributes.addAttribute("org.springframework.validation.BindingResult.userRegisterDto",bindingResult);

            return "redirect:register";

            //TODO ??? ??? ????? ???????? 
        }


        return "redirect:login";

    }


    @ModelAttribute
    public UserLoginDto userLoginDto(){
        return new UserLoginDto();
    }
    @ModelAttribute
    public UserRegisterDto userRegisterDto(){
        return new UserRegisterDto();
    }
}
