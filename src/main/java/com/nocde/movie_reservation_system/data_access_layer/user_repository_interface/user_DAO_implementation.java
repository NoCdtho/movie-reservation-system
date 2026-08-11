package com.nocde.movie_reservation_system.data_access_layer.user_repository_interface;

import com.nocde.movie_reservation_system.data_access_layer.databaseManager;
import com.nocde.movie_reservation_system.model.User;

import java.sql.*;
import java.util.*;

public class user_DAO_implementation implements user_DAO{
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

    @Override
    public void updateUser(User user){
        String sql = "UPDATE user SET user_name = ?, email = ? WHERE user_id = ?";
        try(Connection con = databaseManager.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql)
        ){
            pstm.setString(1, user.getUserName());
            pstm.setString(2, user.getEmail());
            pstm.setInt(3, user.getId());
            int rowsAffected = pstm.executeUpdate();

            if(rowsAffected == 0){
                System.out.println("No user found with id: " + user.getId());
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id){
        String sql = "DELETE FROM user where user_id = ?";
        try(
            Connection con = databaseManager.getConnection(); //used to establish the connection
            PreparedStatement pstm = con.prepareStatement(sql) //preparedStatement is used to pass the sql statement in the connection
        ){
            pstm.setInt(1, id);
            pstm.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}