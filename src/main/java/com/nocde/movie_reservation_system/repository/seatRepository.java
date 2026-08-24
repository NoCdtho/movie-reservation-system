package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.Seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface seatRepository extends JpaRepository<Seat, Integer>{

    //find seats in a spefic row
    List<Seat> findBySeatRow(String seatRow);

    //  find specific row using seat number and seat row
    Optional<Seat> findBySeatRowAndSeatNumber(String seatRow, Integer seatNumber);
}
