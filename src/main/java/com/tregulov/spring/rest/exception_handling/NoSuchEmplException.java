package com.tregulov.spring.rest.exception_handling;

public class NoSuchEmplException extends RuntimeException{

    public NoSuchEmplException(String message) {
        super(message);
    }
}
