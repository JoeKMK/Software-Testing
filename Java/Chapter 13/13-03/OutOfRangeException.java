package com.example.inventory;

public class OutOfRangeException extends RuntimeException {
    public OutOfRangeException(String message) {
        super("A value is out of range.\n" + message);
    }
}
