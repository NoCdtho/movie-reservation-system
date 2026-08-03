package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;
import java.time.*;

@Entity

@Table(name = "movie")

public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer id;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "duration_mins")
    private int duration;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    // public movie(Long id, String title, String genre, int duration) {
    //     this.id = id;
    //     this.title = title;
    //     this.genre = genre;
    //     this.duration = duration;
    // }
    // public Long getId() {
    //     return id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public String getGenre() {
    //     return genre;
    // }

    // public int getDuration() {
    //     return duration;
    // }
}
