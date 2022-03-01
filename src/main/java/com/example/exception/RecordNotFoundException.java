package com.example.exception;

import lombok.Data;


public class RecordNotFoundException extends Exception {
    private String message;
    public RecordNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public RecordNotFoundException() {
    }


}
