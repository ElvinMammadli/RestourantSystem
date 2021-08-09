package com.example.Restourant.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND ,reason = "Not Found")
public class UserNotFoundException extends RuntimeException {



}
