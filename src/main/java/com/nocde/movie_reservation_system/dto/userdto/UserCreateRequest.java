package com.nocde.movie_reservation_system.dto.userdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {
    @NotBlank
    @Size(max = 100)
    private String userName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
