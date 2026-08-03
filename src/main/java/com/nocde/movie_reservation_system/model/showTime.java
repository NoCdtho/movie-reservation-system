package com.nocde.movie_reservation_system.model;
import jakarta.persistence.*;
import java.time.*;
import java.math.BigDecimal;

@Entity

@Table(name = "showtime")

public class showTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "showtime_id", nullable = false)
    private Integer showTimeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private movie movieId;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "price", nullable = false, precision = 8, scale = 2)
    private BigDecimal price;


    
    // public showTime(Long id, Long movieId, String theater, String startTime) {
    //     this.id = id;
    //     this.movieId = movieId;
    //     this.theater = theater;
    //     this.startTime = startTime;
    // }

    // public Long getId() {
    //     return id;
    // }

    // public Long getMovieId() {
    //     return movieId;
    // }

    // public String getTheater() {
    //     return theater;
    // }

    // public String getStartTime() {
    //     return startTime;
    // }
}
