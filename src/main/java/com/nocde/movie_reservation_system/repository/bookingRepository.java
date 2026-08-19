package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.booking;
import com.nocde.movie_reservation_system.model.booking.bookingStatus;
import  com.nocde.movie_reservation_system.model.showTime;
import  com.nocde.movie_reservation_system.model.User;
import  com.nocde.movie_reservation_system.model.seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

// <booking, Integer> booking means the repo to work with booking entity/class and Integer the datatype of primary key 
public interface bookingRepository extends JpaRepository<booking, Integer> {

    // Find all bookings made by a specific user object
    List<booking> findByUserId(User userId);

    // Find all bookings for a specific showtime object
    List<booking> findByShowTimeId(showTime showTimeId);

    // Find all bookings based on their status
    List<booking> findByStatus(bookingStatus status);

    // Check if a specific seat is already booked for a specific showtime
    boolean existsByShowTimeIdAndSeatId(showTime showTimeId, seat seatId);
    
    //Efficient lookup using just the user IDs
    List<booking> findByUserId_Id(Integer userId);
}
