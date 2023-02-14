package com.example.inventory;

class NumberTooLargeException extends OutOfRangeException {
    public NumberTooLargeException(String message) {
        super("A value is too large.\n" + message);
    }
}
