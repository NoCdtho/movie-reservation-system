package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity //used to map the class as database table map

// Table annotation is used specify the database table name and details that a java class maps.
@Table(name = "booking", uniqueConstraints = {
    @UniqueConstraint(name = "unique_showtime_seat", columnNames = {"showtime_id", "seat_id"})
})

public class booking {
    @ManyToOne(fetch = FetchType.LAZY) //enable them to only send data when they are called
    @JoinColumn(name = "user_id", nullable = false) //used to specify foreign key column that connects other columns in a relationship
    private user userId;

    @ManyToOne(fetch = FetchType.LAZY) //same only send data when showtime is called
    @JoinColumn(name = "showtime_id", nullable = false) //same specifies a foreign key
    private showTime showTimeId;

    @Column(name = "booking_time", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime bookingTime;

    @Enumerated(EnumType.STRING) //tells the application to save java enums into the database
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('CONFIRMED', 'CANCELLED', 'WAITING') DEFAULT 'WAITING'")
    private bookingStatus status = bookingStatus.WAITING;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id", nullable = false)
    private seat seatId;
    
    @Id //specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically generates a new unique sequential number for the primary key when a new row is inserted.
    @Column(name = "booking_id") // customizes table column mapping
    private Integer bookingId;

    @Column(name = "booking_reference", nullable = false, length = 50)
    private String bookingReference;

    booking(){}

    booking(user userId, showTime showTimeId, LocalDateTime bookingTime, bookingStatus status, seat seatId, Integer bookingId, String bookingReference){
        this.userId = userId;
        this.showTimeId = showTimeId;
        this.bookingTime = bookingTime;
        this.status = status;
        this.seatId = seatId;
        this.bookingId = bookingId;
        this.bookingReference = bookingReference;
    }
}

enum bookingStatus {
    CONFIRMED,
    CANCELLED,
    WAITING
} 