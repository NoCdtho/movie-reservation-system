package com.nocde.movie_reservation_system.movie;

public class movie {
    private Long id;
    private String title;
    private String genre;
    private int duration;

    public movie(Long id, String title, String genre, int duration) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
