package com.nocde.movie_reservation_system.repository.movie_repository_interface;

import java.util.*;
import com.nocde.movie_reservation_system.model.Movie;

public interface movie_DAO {
    void addMovie(Movie movie);
    Movie getMovieById(int id);
    List<Movie> getAllMovie();
    void updateMovie(Movie movie);
    void deleteMovie(int id);
}
