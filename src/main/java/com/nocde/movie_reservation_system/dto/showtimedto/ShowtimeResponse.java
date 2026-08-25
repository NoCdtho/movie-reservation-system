package com.nocde.movie_reservation_system.dto.showtimedto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowtimeResponse {
    private Integer showtimeId;
    private Integer movieId;
    private LocalDateTime startTime;

}
