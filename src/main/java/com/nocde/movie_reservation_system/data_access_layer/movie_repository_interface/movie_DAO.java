package com.nocde.movie_reservation_system.data_access_layer.movie_repository_interface;

import java.util.*;
import com.nocde.movie_reservation_system.model.movie;

public interface movie_DAO {
    void addMovie(movie movie);
    movie getMovieById(int id);
    List<movie> getAllMovie();
    void updateMovie(movie movie);
    void deleteMovie(int id);
}
