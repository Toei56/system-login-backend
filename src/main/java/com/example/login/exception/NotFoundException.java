package com.example.login.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }

    public static NotFoundException notFound() {
        return new NotFoundException("user.not.found");
    }

    public static NotFoundException loginFailEmailNotFound() {
        return new NotFoundException("user.login.fail");
    }

    public static NotFoundException activateFail() {
        return new NotFoundException("user.activate.fail");
    }

    public static NotFoundException resendActivationTokenlNotFound() {
        return new NotFoundException("user.resend.activation.fail");
    }

    public static NotFoundException templateNotFound() {
        return new NotFoundException("email.template.not.found");
    }
}
