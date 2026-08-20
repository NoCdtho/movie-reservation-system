package com.nocde.movie_reservation_system.Service;

import org.springframework.stereotype.Service;
import com.nocde.movie_reservation_system.repository.movie_repository_interface.movie_DAO;
import com.nocde.movie_reservation_system.model.movie;
import java.util.List;

@Service
public class MovieService {
    private final movie_DAO movie_dao;

    public MovieService(movie_DAO moviedao){
        this.movie_dao = moviedao;
    }

    public void addMovie(movie movie){
        movie_dao.addMovie(movie);
    }

    public movie getMovieById(int id){
        movie movie = movie_dao.getMovieById(id);
        return movie;
    }

    public List<movie> getAllMovie(){
        return movie_dao.getAllMovie();
    }

    public void updateMovie(movie movie){
        movie_dao.updateMovie(movie);
    }

    public void deleteMovie(int id){
        movie_dao.deleteMovie(id);
    }
}
