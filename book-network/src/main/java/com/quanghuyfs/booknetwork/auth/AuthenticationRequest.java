package com.quanghuyfs.booknetwork.auth;

import jakarta.validation.constraints.*;
import lombok.Data;

public record AuthenticationRequest(
        @Email(message = "Email is not formatted")
        @NotEmpty(message = "Email is mandatory")
        @NotBlank(message = "Email is mandatory")
        String email,
        @Size(min = 8,message = "Email is not formatted")
        @NotBlank(message = "Password is mandatory")
        @NotEmpty(message = "Password is mandatory")
        String password

) {
}
