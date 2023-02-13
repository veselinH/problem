package com.example.eaxm_spotify.init;

import com.example.eaxm_spotify.service.impl.StyleServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

    private final StyleServiceImpl styleService;

    public DBInit(StyleServiceImpl styleService) {
        this.styleService = styleService;
    }

    @Override
    public void run(String... args) throws Exception {

        styleService.initStyles();
    }
}
