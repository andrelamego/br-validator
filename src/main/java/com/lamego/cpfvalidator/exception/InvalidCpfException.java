package com.lamego.cpfvalidator.exception;

public class InvalidCpfException extends RuntimeException {
    public InvalidCpfException(String message) {
        super(message);
    }
}
