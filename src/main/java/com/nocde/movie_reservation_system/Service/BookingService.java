package com.nocde.movie_reservation_system.Service;
import com.nocde.movie_reservation_system.repository.bookingRepository;
import org.springframework.stereotype.Service;
import com.nocde.movie_reservation_system.model.booking;
import com.nocde.movie_reservation_system.model.User;
import java.util.*;

@Service
public class BookingService {
    private final bookingRepository booking_repository;

    BookingService(bookingRepository booking_repository){
        this.booking_repository = booking_repository;
    }

    // Error: Not handled in this function call 
    // Retrive a particular booking
    public booking getBookingById(int bookingId) {
        return booking_repository.findByBookingId(bookingId);
    }

    // Retrive all booking made by a user
    public List<booking> getAllBookings(User userId){
        return booking_repository.findByUserId(userId);
    }

    
}
