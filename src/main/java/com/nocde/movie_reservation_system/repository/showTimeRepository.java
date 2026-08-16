package com.nocde.movie_reservation_system.repository;

import  com.nocde.movie_reservation_system.model.showTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface showTimeRepository extends JpaRepository<showTime, Integer>{
    
}
