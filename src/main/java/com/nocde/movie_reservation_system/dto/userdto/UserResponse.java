package com.nocde.movie_reservation_system.dto.userdto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Integer userId;
    private String userName;
    private String email;
}
