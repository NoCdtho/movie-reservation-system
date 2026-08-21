package com.nocde.movie_reservation_system.Service;
import com.nocde.movie_reservation_system.repository.bookingRepository;
import org.springframework.stereotype.Service;
import com.nocde.movie_reservation_system.model.booking;
import com.nocde.movie_reservation_system.model.User;
import com.nocde.movie_reservation_system.model.showTime;
import com.nocde.movie_reservation_system.model.booking.bookingStatus;
import com.nocde.movie_reservation_system.model.seat;
import java.util.*;

@Service
public class BookingService {
    private final bookingRepository booking_repository;

    BookingService(bookingRepository booking_repository){
        this.booking_repository = booking_repository;
    }

    // Retrive all booking made by a user id
    public List<booking> getAllBookings(User userId){
        return booking_repository.findByUserId(userId);
    }

    // Retrive all the booking for a specific user using showTime id 
    public List<booking> getByShowTimeId(showTime showTimeId){
        return booking_repository.findByShowTimeId(showTimeId);
    }

    // Retrive all booking based on their booking status
    public List<booking> getByStatus(bookingStatus status){
        return booking_repository.findByStatus(status);
    }

    // Retrive the seat is booked or not for a particular showtime
    public boolean IsSeatBooked(showTime showTimeId, seat seatId){
        return booking_repository.existsByShowTimeIdAndSeatId(showTimeId, seatId);
    }

    // Error: Not handled in this function call 
    // Retrive a particular booking
    public booking getBookingById(int bookingId) {
        return booking_repository.findByBookingId(bookingId);
    } 
    
}
