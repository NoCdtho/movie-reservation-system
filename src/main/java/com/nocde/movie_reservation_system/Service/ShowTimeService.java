package com.nocde.movie_reservation_system.Service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

import com.nocde.movie_reservation_system.repository.showTimeRepository;
import com.nocde.movie_reservation_system.model.showTime;
import com.nocde.movie_reservation_system.model.movie;
import java.util.List;
import java.util.Optional;
import java.math.*;


@Service
public class ShowTimeService {
    private final showTimeRepository show_time_repository;

    ShowTimeService(showTimeRepository show_time_repository){
        this.show_time_repository = show_time_repository;
    }

    List<showTime> getAllMovieByShowTimeId(Integer showTimeId){
        return show_time_repository.findByShowTimeId(showTimeId);
    }

    List<showTime> getAllMovieByStartTime(LocalDateTime startTime){
        return show_time_repository.findByStartTimeAfter(startTime);
    }

    List<showTime> getAllMoviesBetweenTime(LocalDateTime startTime, LocalDateTime endTime){
        return show_time_repository.findByStartTimeBetween(startTime, endTime);
    }

    List<showTime> getAllMoviesCheaper(BigDecimal maxPrice){
        return show_time_repository.findByPriceLessThanEqual(maxPrice);
    }

    Optional<showTime> getMovieBYIdAndStartTime(movie movieId, LocalDateTime startTime){
        return show_time_repository.findByMovieIdAndStartTime(movieId, startTime);
    }
}
