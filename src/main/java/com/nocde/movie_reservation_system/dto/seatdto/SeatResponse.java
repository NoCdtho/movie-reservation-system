package com.nocde.movie_reservation_system.dto.seatdto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeatResponse {
    private String seatRow;
    private Integer seatNumber;
}
