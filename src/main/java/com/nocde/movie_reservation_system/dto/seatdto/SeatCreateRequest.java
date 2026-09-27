package com.nocde.movie_reservation_system.dto.seatdto;

/*
Users can request with user_ID to gets it's seat number and seat row
*/
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SeatCreateRequest {
    private Integer seatId;
}
