package com.nocde.movie_reservation_system.dto.moviedto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponse {
    private Integer movieId;
    private String title;
    private String description;
    private Integer durationMins;
    private LocalDate releaseDate;
}
