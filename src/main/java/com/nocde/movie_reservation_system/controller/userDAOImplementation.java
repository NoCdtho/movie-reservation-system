package com.nocde.movie_reservation_system.controller;

import com.nocde.movie_reservation_system.model.User;
import com.nocde.movie_reservation_system.controller.databaseManager;

import java.sql.*;
import java.util.*;

public class userDAOImplementation implements userDAO{
    @Override
    public void addUser(User user){
        String sql = "INSERTS INTO users (user_name, email) VALUES (?, ?)";
        try(
            Connection connection = databaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
          preparedStatement.setString(1, user.getUserName());
          preparedStatement.setString(2, user.getEmail());
          preparedStatement.executeUpdate();  
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public User getUserId(int id){
        String sql = "SELECT * FROM users WHERE id = ?";
        User user = null;
        try(
            Connection connection = databaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();

            // mapp back to the java model from database
            if(result.next()){
                user = new User();
                user.setId(result.getInt("user_id"));
                user.setUserName(result.getString("user_name"));
                user.setEmail(result.getString("email"));
                user.setCreatedTime(result.getTimestamp("created_at").toLocalDateTime());
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}