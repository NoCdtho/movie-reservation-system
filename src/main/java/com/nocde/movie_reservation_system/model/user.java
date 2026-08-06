package com.nocde.movie_reservation_system.model;

import jakarta.persistence.*;
import java.time.*;

// This helps jpa to treat it as a database table 
@Entity

@Table(
    name = "users"
)

public class User {
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

    // Empty Constructors
    public User(){}
    
    User(Integer userId, String userName, String email, LocalDateTime createdTime){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.createdTime = createdTime;
    }

    // getters
    public Integer getId(){
        return userId;
    }

    public String getUserName(){
        return userName;
    }

    public String getEmail(){
        return email;
    }

    public LocalDateTime getCreatedTime(){
        return createdTime;
    }

    //Setters 
    public void setId(Integer Id){
        this.userId = Id;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCreatedTime(LocalDateTime createdTime){
        this.createdTime = createdTime;
    }
}
