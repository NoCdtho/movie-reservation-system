package com.nocde.movie_reservation_system.controller;

import com.nocde.movie_reservation_system.model.movie;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/movies")
public class movieController {

    @GetMapping
    public List<movie> getAllMovies(){
        return List.of(
            new movie(1L, "Inception", "Goted", 2),
            new movie(2L, "Intersteller", "Second Goated", 3),
            new movie(3L, "The Dark Knight", "myGod", 4)
        );
    }

    @GetMapping("/{id}")
    public movie getMovieById(@PathVariable Long id) {

        return new movie(id, "Inception", "Sci-Fi", 148);
    }

}
