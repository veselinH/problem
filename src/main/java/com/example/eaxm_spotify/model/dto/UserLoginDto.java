package com.example.eaxm_spotify.model.dto;

import jakarta.validation.constraints.Size;

public class UserLoginDto {
    private String username;
    private String password;

    public UserLoginDto() {
    }
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters !!!")
    public String getUsername() {
        return username;
    }

    public UserLoginDto setUsername(String username) {
        this.username = username;
        return this;
    }
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters !!!")
    public String getPassword() {
        return password;
    }

    public UserLoginDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
