package com.asutech.casedataservice.api;

import com.asutech.casedataservice.exception.CaseNotFoundException;
import com.asutech.casedataservice.exception.ExistingRecordFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
@RestController
public class ExceptionController {
    @ExceptionHandler(CaseNotFoundException.class)
    public final ResponseEntity<String> handleCaseNotFoundException(CaseNotFoundException ex,
                                                                                   WebRequest request) {
        return new ResponseEntity<>("Case cannot be found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ExistingRecordFoundException.class)
    public final ResponseEntity<String> handleExistingRecordFoundException(ExistingRecordFoundException ex,
                                                                                 WebRequest request) {
        return new ResponseEntity<>("Case has already existed", HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<String> handleAllExceptions(Exception ex, WebRequest request) {
        return new  ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
