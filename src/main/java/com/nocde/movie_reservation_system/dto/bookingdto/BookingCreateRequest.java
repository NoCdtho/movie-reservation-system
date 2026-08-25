package com.nocde.movie_reservation_system.dto.bookingdto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingCreateRequest {
    @NotNull(message = "User ID is required")
    private Integer userId;

    @NotNull(message = "Showtime ID is required")
    private Integer showtimeId;
}
