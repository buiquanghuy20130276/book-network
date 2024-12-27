package com.quanghuyfs.booknetwork.auth;

import lombok.Builder;

@Builder
public record AuthenticationResponse(
        String token

) {
}
