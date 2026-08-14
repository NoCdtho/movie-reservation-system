package com.nocde.movie_reservation_system.data_access_layer.booking_repository_interface;

/* 
This file is the implementation of the DAO functions that are
created and SQL command will be used here to tell how each function
works
*/

import java.sql.*;
import java.util.*;
import com.nocde.movie_reservation_system.data_access_layer.databaseManager;
import com.nocde.movie_reservation_system.model.booking;

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
    public booking getBookingById(int userId){
        booking bk = null;
        return bk;
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
