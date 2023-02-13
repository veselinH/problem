package com.example.eaxm_spotify.service.impl;

import com.example.eaxm_spotify.model.entity.Style;
import com.example.eaxm_spotify.model.entity.enums.StyleName;
import com.example.eaxm_spotify.repository.StyleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StyleServiceImpl {
    private final StyleRepository styleRepository;

    public StyleServiceImpl(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    public void initStyles() {
        if(styleRepository.count()==0){
            Arrays.stream(StyleName.values())
                    .forEach(styleName -> {
                        Style style=new Style();
                        style.setStyleName(styleName);
                        style.setDescription("the style of the song");

                        styleRepository.save(style);
                    });
        }
    }
}
