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

            // convert the releaseDate of type LocalDate (java.time.date) into Date (java.sql.time)
            LocalDate localdate = movie.getReleaseDate(); //java.time
            Date date = Date.valueOf(localdate); //java.sql
            prep.setDate(4, date);

            prep.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public movie getMovieById(int id){
        movie m = null;
        String SQL = "SELECT * FROM movie where movie_id = ?";
        try(
            Connection con = databaseManager.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
        ){
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();
            if(result.next()){
                m = new movie();
                m.setDescription(result.getString("description"));
                m.setDurationMins(result.getInt("duration_mins"));
                Date date = result.getDate("release_date");//java.sql
                LocalDate localdate = date.toLocalDate();
                m.setReleaseDate(localdate);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return m;
    }

    public List<movie> getAllMovie(){
        List<movie> m = new ArrayList<>();
        movie movie = null;
        String SQL = "SELECT * FROM movie";
        
        try(
            Connection con = databaseManager.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet result = preparedStatement.executeQuery(SQL)
        ){
            while(result.next()){
                movie  = new movie();
                movie.setDescription(result.getString("description"));
                movie.setDurationMins(result.getInt("duration_mins"));
                Date date = result.getDate("release_date");//java.sql
                LocalDate localdate = date.toLocalDate();
                movie.setReleaseDate(localdate);
                m.add(movie);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        } 
        return m;
    }

    public void updateMovie(movie movie){

    }

    public void deleteMovie(int id){

    }

}
