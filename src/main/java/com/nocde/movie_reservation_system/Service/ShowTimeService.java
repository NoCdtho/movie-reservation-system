package com.nocde.movie_reservation_system.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

import com.nocde.movie_reservation_system.repository.showTimeRepository;
import com.nocde.movie_reservation_system.model.Showtime;
import com.nocde.movie_reservation_system.model.Movie;
import java.util.List;
import java.util.Optional;
import java.math.*;


@Service
public class ShowTimeService {
    private final showTimeRepository show_time_repository;

    ShowTimeService(showTimeRepository show_time_repository){
        this.show_time_repository = show_time_repository;
    }

    List<Showtime> getAllMovieByShowTimeId(Integer showTimeId){
        return show_time_repository.findByShowTimeId(showTimeId);
    }

    List<Showtime> getAllMovieByStartTime(LocalDateTime startTime){
        return show_time_repository.findByStartTimeAfter(startTime);
    }

    List<Showtime> getAllMoviesBetweenTime(LocalDateTime startTime, LocalDateTime endTime){
        return show_time_repository.findByStartTimeBetween(startTime, endTime);
    }

    List<Showtime> getAllMoviesCheaper(BigDecimal maxPrice){
        return show_time_repository.findByPriceLessThanEqual(maxPrice);
    }

    Optional<Showtime> getMovieBYIdAndStartTime(Movie movieId, LocalDateTime startTime){
        return show_time_repository.findByMovieIdAndStartTime(movieId, startTime);
    }
}
