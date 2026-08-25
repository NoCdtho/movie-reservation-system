package com.nocde.movie_reservation_system.dto.bookingdto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponse {
    private Integer bookingId;
    private String bookingReference;
    private Integer seatId;
    private String status;
    private LocalDateTime bookingTime;
}
