package com.nocde.movie_reservation_system.dto.showtimedto;

import java.time.LocalDateTime;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowtimeCreateRequest {
    
    @NotNull(message = "Movie ID is required")
    private Integer movieId;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;
}
