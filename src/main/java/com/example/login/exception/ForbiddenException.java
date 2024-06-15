package com.example.login.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }

    public static ForbiddenException loginFailUserUnactivated() {
        return new ForbiddenException("user.login.fail.unactivated");
    }
}
