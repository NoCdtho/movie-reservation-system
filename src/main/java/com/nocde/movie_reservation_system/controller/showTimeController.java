package com.nocde.movie_reservation_system.controller;

import com.nocde.movie_reservation_system.model.showTime;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("showTimes")
public class showTimeController {

     @GetMapping
    public List<showTime> getAllShowtimes() {
        return List.of(
                new showTime(1L, 1L, "Screen 1", "2026-07-17T10:00"),
                new showTime(2L, 1L, "Screen 2", "2026-07-17T14:00"),
                new showTime(3L, 2L, "Screen 3", "2026-07-17T18:30")
        );
    }
    
    @GetMapping("/{id}")
    public showTime getShowtimeById(@PathVariable Long id) {
        return new showTime(id, 1L, "Screen 1", "2026-07-17T10:00");
    }
}
