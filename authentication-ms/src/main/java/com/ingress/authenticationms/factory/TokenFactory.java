package com.ingress.authenticationms.factory;

import com.ingress.authenticationms.security.model.AccessTokenClaimsSet;
import com.ingress.authenticationms.security.model.RefreshTokenClaimsSet;

import java.util.Date;

import static com.ingress.authenticationms.model.constants.AuthConstants.ISSUER;

public interface TokenFactory {
    static AccessTokenClaimsSet buildAccessTokenClaimsSet(Long userId, Date expirationTime) {
        return AccessTokenClaimsSet.builder()
                .iss(ISSUER)
                .userId(userId)
                .createdTime(new Date())
                .expirationTime(expirationTime)
                .build();
    }

    static RefreshTokenClaimsSet buildRefreshTokenClaimsSet(Long userId,
                                                            Integer refreshTokenExpirationCount,
                                                            Date expirationTime) {
        return RefreshTokenClaimsSet.builder()
                .iss(ISSUER)
                .userId(userId)
                .expirationTime(expirationTime)
                .count(refreshTokenExpirationCount)
                .build();
    }

}
