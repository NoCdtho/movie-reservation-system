package com.nocde.movie_reservation_system.model;

/*
This class used to create information for a particular movie.
*/

public class showTime {
    private Long id;
    private Long movieId;
    private String theater;
    private String startTime;

    public showTime(Long id, Long movieId, String theater, String startTime) {
        this.id = id;
        this.movieId = movieId;
        this.theater = theater;
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTheater() {
        return theater;
    }

    public String getStartTime() {
        return startTime;
    }
}
