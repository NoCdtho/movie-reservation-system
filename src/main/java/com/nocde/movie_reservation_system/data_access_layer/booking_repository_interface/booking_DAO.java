package com.nocde.movie_reservation_system.data_access_layer.booking_repository_interface;

/*This interface is used to create abstract function for CRUD opertions */

import com.nocde.movie_reservation_system.model.booking;
import java.util.*;

public interface booking_DAO {
    void addBooking(booking booking); //CREATE operation
    booking getBookingById(int userId); //READ operation
    List<booking> getAllBooking(booking booking); //READ operation
    void updateBooking(booking booking); //UPDATE
    void deleteBooking(int id); //DELETE 
}
