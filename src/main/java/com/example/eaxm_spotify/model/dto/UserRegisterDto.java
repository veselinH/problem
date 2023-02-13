package com.example.eaxm_spotify.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegisterDto {
    @Size(min = 5,max = 10,message = "USERNAMEEEEEEEE")
    private String username;
    @Size(min = 5,max = 10,message = "USERNAMEEEEEEEE")
    private String password;
    @Email(message = "EMAILLLLLL")
    private String email;
    @Size(min = 5,max = 10,message = "USERNAMEEEEEEEE")
    private String confirmPassword;

    public UserRegisterDto() {
    }

    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters !!!")
    public String getUsername() {
        return username;
    }

    public UserRegisterDto setUsername(String username) {
        this.username = username;
        return this;
    }

    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters !!!")
    public String getPassword() {
        return password;
    }

    public UserRegisterDto setPassword(String password) {
        this.password = password;
        return this;
    }

    @Email(message = "Enter valid email !!!")
    @NotBlank(message = "Email cannot be empty String!")
    public String getEmail() {
        return email;
    }

    public UserRegisterDto setEmail(String email) {
        this.email = email;
        return this;
    }

    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters !!!")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterDto setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
