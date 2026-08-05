package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;
import java.time.*;

// This helps jpa to treat it as a database table 
@Entity

@Table(
    name = "users"
)

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
        name="user_id",
        nullable = false
    )
    private Integer userId;

    @Column(
        name ="user_name", 
        nullable = false,
        length = 100
    )
    private String userName;

    @Column(
        name = "email", 
        length = 100,
        unique = true,
        nullable = false
    )
    private String email;

    @Column(
        name = "created_at",
        insertable = false, 
        updatable = false, 
        columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
    )
    private LocalDateTime createdTime;
}
