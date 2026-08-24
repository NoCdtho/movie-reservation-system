package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.Booking;
import com.nocde.movie_reservation_system.model.Booking.bookingStatus;
import  com.nocde.movie_reservation_system.model.Showtime;
import  com.nocde.movie_reservation_system.model.User;
import  com.nocde.movie_reservation_system.model.Seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository

// <booking, Integer> booking means the repo to work with booking entity/class and Integer the datatype of primary key 
public interface bookingRepository extends JpaRepository<Booking, Integer> {

    // Find all bookings made by a specific user object
    List<Booking> findByUserId(User userId);

    // Find all bookings for a specific showtime object
    List<Booking> findByShowTimeId(Showtime showTimeId);

    // Find all bookings based on their status
    List<Booking> findByStatus(bookingStatus status);

    // Check if a specific seat is already booked for a specific showtime
    boolean existsByShowTimeIdAndSeatId(Showtime showTimeId, Seat seatId);
    
    // Find a particular booking by the booking ID
    Booking findByBookingId(Integer bookingId);
}
