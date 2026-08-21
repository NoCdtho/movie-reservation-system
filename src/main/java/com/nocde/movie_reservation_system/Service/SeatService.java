package com.nocde.movie_reservation_system.Service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.nocde.movie_reservation_system.model.seat;
import com.nocde.movie_reservation_system.repository.seatRepository;

@Service
public class SeatService {
    private final seatRepository seat_repository;

    SeatService(seatRepository seatRepository){
        this.seat_repository = seatRepository;
    }

    List<seat> findBySeatRow(String seatRow){
        return seat_repository.findBySeatRow(seatRow);
    }

    Optional<seat> findBySeatRowAndSeatNumber(String seatRow, Integer seatNumber){
        return seat_repository.findBySeatRowAndSeatNumber(seatRow, seatNumber);
    }
}
