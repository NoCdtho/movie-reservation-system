package com.nocde.movie_reservation_system.controller;

import com.nocde.movie_reservation_system.model.movie;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//This is a spring annotation used for building restfull webservice this returns data directly (like JSON or XML)
@RestController
//This is a spring annotation used to MAP incoming HTTP requests to a specific controller class.
@RequestMapping("/movies") 
public class movieController {

    /*
    This spring framework annotation maps the HTTP GET requests to specific methods in a controller 
    below no parenthesis is passed therefore it inherits the RequestMapping path that is /movies
    */
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
