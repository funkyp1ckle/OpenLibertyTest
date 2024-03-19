package com.funkypickle.gateway;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

public class JwtUtils {
    @Value("${auth.jwtSecret}")
    private static String jwtSecret;
    public static boolean validateToken(String token) {
        try {
            Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(jwtSecret.getBytes()))
                .build()
                .parseSignedClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    public static Claims getClaims(String token) {
        return Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(jwtSecret.getBytes()))
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public static Long getUserIdFromJWT(Claims claims) {
        return Long.parseLong(claims.getSubject());
    }
}
