package com.example.eaxm_spotify.model.entity;

import com.example.eaxm_spotify.model.entity.enums.StyleName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "styles")
public class Style extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private StyleName styleName;
    private String description;

    public Style() {
    }

    public StyleName getStyleName() {
        return styleName;
    }

    public Style setStyleName(StyleName styleName) {
        this.styleName = styleName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Style setDescription(String description) {
        this.description = description;
        return this;
    }
}
