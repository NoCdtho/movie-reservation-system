package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface seatRepository extends JpaRepository<seat, Integer>{

    //find seats in a spefic row
    List<seat> findBySeatRow(String seatRow);

    //  find specific row using seat number and seat row
    Optional<seat> findBySeatRowAndSeatNumber(String seatRow, Integer seatNumber);
}
