package com.nocde.movie_reservation_system.repository.booking_repository_interface;

/* 
This file is the implementation of the DAO functions that are
created and SQL command will be used here to tell how each function
works
*/

import java.sql.*;
import java.util.*;

import com.nocde.movie_reservation_system.model.booking;
import com.nocde.movie_reservation_system.repository.databaseManager;

public class booking_DAO_implementation implements booking_DAO {

    @Override
    public void addBooking(booking booking){
        String SQL = "INSERT INTO booking (user_id, showtime_id, status, seat_id, booking_reference) VALUES (?, ?, ?, ?)";
        try(
            Connection connection = databaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ){
            preparedStatement.setInt(1, booking.getUserId().getUserId());
            preparedStatement.setInt(2, booking.getShowTimeId().getShowTimeId());
            preparedStatement.setString(3, booking.getBookingStatus().name());
            preparedStatement.setInt(3, booking.getSeatId().getSeatId());
            preparedStatement.setString(3, booking.getBookingReference());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }   
    }

    @Override
    public booking getBookingById(int bookingId){ //PROBLEM: WHO WILL PASS THE VALUE IN THIS FUNCTION  
        String SQL = "SELECT * From booking WHERE booking_id = ?";
        booking book = new booking();

        try(
            Connection con  = databaseManager.getConnection();
            PreparedStatement prep = con.prepareStatement(SQL);
        ){
            prep.setInt(1, bookingId);
            ResultSet result = prep.executeQuery(); //next is the pointer

            if(result.next()){
                book.setBookingReference(result.getString("booking_reference"));
                int showtimeId = result.getInt("showtime_id"); //retrives the showtime id in form of integer
                
                book.setShowTimeId();

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public List<booking> getAllBooking(booking booking){
        List<booking> list = null;
        return list;
    }

    @Override
    public void updateBooking(booking booking){

    }

    @Override
    public void deleteBooking(int id){

    }
}
