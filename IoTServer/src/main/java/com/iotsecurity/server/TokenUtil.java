package com.iotsecurity.server;

import java.util.UUID;

public class TokenUtil {

    public static String generateToken() {
        return UUID.randomUUID().toString();
    }

    public static boolean verifyToken(String token) {

        if (token == null || token.isEmpty()) {
            return false;
        }

        return true;
    }

}