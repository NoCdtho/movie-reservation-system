package com.nocde.movie_reservation_system.service;

import org.springframework.stereotype.Service;
import com.nocde.movie_reservation_system.repository.movie_repository_interface.movie_DAO;
import com.nocde.movie_reservation_system.model.Movie;
import java.util.List;

@Service
public class MovieService {
    private final movie_DAO movie_dao;

    public MovieService(movie_DAO moviedao){
        this.movie_dao = moviedao;
    }

    // Inserting movie in the database
    public void addMovie(Movie movie){
        movie_dao.addMovie(movie);
    }

    // Retriving movie using movie id from the database 
    public Movie getMovieById(int id){
        Movie movie = movie_dao.getMovieById(id);
        return movie;
    }

    // Retriving all the movie from the database 
    public List<Movie> getAllMovie(){
        return movie_dao.getAllMovie();
    }

    // Update a movie detail in the database
    public void updateMovie(Movie movie){
        movie_dao.updateMovie(movie);
    }

    // Delete a movie from the database 
    public void deleteMovie(int id){
        movie_dao.deleteMovie(id);
    }
}
