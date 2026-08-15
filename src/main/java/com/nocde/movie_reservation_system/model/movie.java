package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;
import java.time.*;

@Entity

@Table(name = "movie")

public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration_mins")
    private Integer durationMins;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    movie(){}

    public movie(Integer movieId, String title, String description, Integer durationMins, LocalDate releaseDate) {
        this.movieId = movieId;
        this.title = title;
        this.title = title;
        this.durationMins = durationMins;
        this.releaseDate = releaseDate;
    }

    public Integer getId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDuration() {
        return durationMins;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }  

    // SETTERS
    public void setId(Integer movieId){
        this.movieId = movieId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setDurationMins(Integer durationMins){
        this.durationMins = durationMins;
    }
    public void setReleaseDate(LocalDate releaseDate){
        this.releaseDate= releaseDate;
    }
}
