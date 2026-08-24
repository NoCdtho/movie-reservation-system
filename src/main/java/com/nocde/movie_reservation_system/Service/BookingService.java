package com.nocde.movie_reservation_system.service;

import org.springframework.stereotype.Service;

import com.nocde.movie_reservation_system.repository.bookingRepository;
import com.nocde.movie_reservation_system.model.Booking;
import com.nocde.movie_reservation_system.model.User;
import com.nocde.movie_reservation_system.model.Showtime;
import com.nocde.movie_reservation_system.model.Booking.bookingStatus;
import com.nocde.movie_reservation_system.model.Seat;
import java.util.*;

@Service
public class BookingService {
    private final bookingRepository booking_repository;

    BookingService(bookingRepository booking_repository){
        this.booking_repository = booking_repository;
    }

    // Retrive all booking made by a user using user id
    public List<Booking> getAllBookings(User userId){
        return booking_repository.findByUserId(userId);
    }

    // Retrive all the booking done for a specific show using showTime id 
    public List<Booking> getByShowTimeId(Showtime showTimeId){
        return booking_repository.findByShowTimeId(showTimeId);
    }

    // Retrive all booking based on their booking status
    public List<Booking> getByStatus(bookingStatus status){
        return booking_repository.findByStatus(status);
    }

    // Retrive the status of the seat is booked or not for a particular showtime
    public boolean IsSeatBooked(Showtime showTimeId, Seat seatId){
        return booking_repository.existsByShowTimeIdAndSeatId(showTimeId, seatId);
    }

    // Error: Not handled in this function call 
    // Retrive a particular booking using its booking id
    public Booking getBookingById(int bookingId) {
        return booking_repository.findByBookingId(bookingId);
    } 
    
}
