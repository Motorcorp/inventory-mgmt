package com.motorcorp.inventorymgmt.presentation.rest;

import com.motorcorp.inventorymgmt.exception.NotFoundException;
import com.motorcorp.inventorymgmt.presentation.rest.dto.ConfirmMessageFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler {

    private ConfirmMessageFactory confirmMessageFactory;

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(NotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(confirmMessageFactory.createConfirmMessage(UrlConstants.REQUEST_STATUS_FAILED,e.getMessageKey(),e.getMessage()));
    }
}
