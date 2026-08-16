package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.booking;
import com.nocde.movie_reservation_system.model.booking.bookingStatus;
import  com.nocde.movie_reservation_system.model.showTime;
import  com.nocde.movie_reservation_system.model.User;
import  com.nocde.movie_reservation_system.model.seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository

// <booking, Integer> booking means the repo to work with booking entity/class and Integer the datatype of primary key 
public interface bookingRepository extends JpaRepository<booking, Integer> {

    // 1. Find a specific booking by its reference code (e.g., "REF-12345")
    Optional<booking> findByBookingReference(String bookingReference);

    // 2. Find all bookings made by a specific user object
    List<booking> findByUserId(User userId);

    // 3. Find all bookings for a specific showtime object
    List<booking> findByShowTimeId(showTime showTimeId);

    // 4. Find all bookings based on their status (e.g., find all CANCELLED bookings)
    List<booking> findByStatus(bookingStatus status);

    // 5. CRITICAL FOR BOOKING: Check if a specific seat is already booked for a specific showtime
    boolean existsByShowTimeIdAndSeatId(showTime showTimeId, seat seatId);
    
    // 6. Efficient lookup using just the integer IDs (without needing the full objects)
    List<booking> findByUserId_Id(Integer userId);
    List<booking> findByShowTimeId_ShowTimeId(Integer showTimeId);
}
