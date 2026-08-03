package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;

@Entity

@Table(name = "seat", uniqueConstraints = {
    @UniqueConstraint(name = "seat_row", columnNames = {"seat_row", "seat_number"})
})

public class seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id", nullable = false)
    private Integer seatId;

    @Column(name = "seat_row", nullable = false, length = 5)
    private String seatRow;

    @Column(name = "seat_number", nullable = false)
    private Integer seatNumber;
}
