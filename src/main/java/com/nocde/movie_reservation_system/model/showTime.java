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

    public showTime(){}
    
    public showTime(Integer showTimeId, movie movieId, LocalDateTime startTime, LocalDateTime endTime, BigDecimal price) {
        this.showTimeId = showTimeId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public Integer getShowTimeId() {
        return showTimeId;
    }

    public movie getMovieId() {
        return movieId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public BigDecimal getPrice(){
        return price;
    }
}
