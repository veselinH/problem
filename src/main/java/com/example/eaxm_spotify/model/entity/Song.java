package com.example.eaxm_spotify.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "songs")
public class Song extends BaseEntity{
    @Column(name = "performer",nullable = false)
    private String performer;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer duration;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    @ManyToOne
    private Style style;

    public Song() {
    }

    public String getPerformer() {
        return performer;
    }

    public Song setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Song setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Song setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Song setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public Song setStyle(Style style) {
        this.style = style;
        return this;
    }
}
