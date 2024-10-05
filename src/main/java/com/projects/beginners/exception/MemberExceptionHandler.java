package com.projects.beginners.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MemberExceptionHandler {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<Object> handleMemberNotFoundException(MemberNotFoundException memberNotFoundException) {
        MemberException memberException = new MemberException(
                memberNotFoundException.getMessage(),
                memberNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(memberException, HttpStatus.NOT_FOUND);
    }
}
