package com.nocde.movie_reservation_system.data_access_layer.movie_repository_interface;

import com.nocde.movie_reservation_system.data_access_layer.databaseManager;
import com.nocde.movie_reservation_system.model.movie;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.time.*;

public class movie_DAO_implementation implements movie_DAO{

    public void addMovie(movie movie){
        String SQL = "INSERT INTO movie (title, description, duration_mins, release_date) values (?, ?, ?, ?)"; 
        try(
            Connection con = databaseManager.getConnection();
            PreparedStatement prep = con.prepareStatement(SQL);
        ){
            prep.setString(1, movie.getTitle());
            prep.setString(2, movie.getDescription());
            prep.setInt(3, movie.getDuration());

            // convert the releaseDate of type LocalDate (java.time.data) into Date (java.sql.time)
            LocalDate localdate = movie.getReleaseDate();
            Date date = Date.valueOf(localdate);
            prep.setDate(4, date);

            prep.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public movie getMovieById(int id){
        movie m = null;
        return m;
    }

    public List<movie> getAllMovie(){
        List<movie> m = new ArrayList<>();
        return m;
    }

    public void updateMovie(movie movie){

    }

    public void deleteMovie(int id){

    }
}
