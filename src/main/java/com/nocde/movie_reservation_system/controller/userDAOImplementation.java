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
        // This is a try-with-resouce block unique thing is as the try block ends this calls the close functions of the connections 
        try(
            Connection connection = databaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ){
            preparedStatement.setInt(1, id); //This line puts (int id) in place of ? 
            ResultSet result = preparedStatement.executeQuery();

            // This if block map back to the last updated data back to the java model from database.
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

    @Override 
    public List<User> getAllUser(){
        String sql = "SELECT * FROM user";
        List<User> list = new ArrayList<>();

        try(
            Connection con = databaseManager.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet result = pstm.executeQuery();
        ){
            while(result.next()){
                User user = new User();
                user.setId(result.getInt("user_id"));
                user.setUserName(result.getString("user_name"));
                user.setEmail(result.getString("email"));
                user.setCreatedTime(result.getTimestamp("created_at").toLocalDateTime());
                list.add(user);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}