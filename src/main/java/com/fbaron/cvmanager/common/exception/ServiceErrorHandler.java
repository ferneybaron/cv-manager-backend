package com.fbaron.cvmanager.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Slf4j
@ControllerAdvice
public class ServiceErrorHandler {

    public static final String AN_ERROR_OCCURRED_DURING_PROCESSING = "An error occurred during processing:";
    public static final String MESSAGE = "message";

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<?> methodArgumentNotValidException(Exception ex) {
        var errors = (BindException) ex;
        Map<String, Object> parameters = new HashMap<>();
        errors.getAllErrors().forEach(e -> parameters
                .put(MESSAGE, String.format(AN_ERROR_OCCURRED_DURING_PROCESSING + " %s", e.getDefaultMessage())));
        return new ResponseEntity<>(parameters, HttpStatus.BAD_REQUEST);
    }

}
