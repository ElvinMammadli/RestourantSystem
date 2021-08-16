package com.example.Restourant.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND ,reason = "Restourant Not Found")
public class RestourantNotFoundException extends RuntimeException {

    public RestourantNotFoundException(String message) {
        super(message);
    }

}
