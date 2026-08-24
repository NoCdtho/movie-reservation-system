package com.nocde.movie_reservation_system.repository;

import com.nocde.movie_reservation_system.model.Movie;
import  com.nocde.movie_reservation_system.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface showTimeRepository extends JpaRepository<Showtime, Integer>{

    // find the all the movies and their showtime
    List<Showtime> findByShowTimeId(Integer showTimeId);

    // find movie with particular start time 
    List<Showtime> findByStartTimeAfter(LocalDateTime starttime);

    //Find showtimes between a specific start and end time (useful for "today's shows")
    List<Showtime> findByStartTimeBetween(LocalDateTime start, LocalDateTime end);

    //Find all showtimes cheaper than or equal to a specific price
    List<Showtime> findByPriceLessThanEqual(BigDecimal maxPrice);

    //Find a showtime for a specific movie happening at a specific time
    Optional<Showtime> findByMovieIdAndStartTime(Movie movieId, LocalDateTime startTime);
}
