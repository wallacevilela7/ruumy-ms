package com.example.meeting.exception;

public class AlreadyBookedException extends RuntimeException{

    public AlreadyBookedException(String message) {
        super(message);
    }
}
