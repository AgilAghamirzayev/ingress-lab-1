package com.ingress.authenticationms.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class TokenResponse {
    private String accessToken;
    private String refreshToken;
}
