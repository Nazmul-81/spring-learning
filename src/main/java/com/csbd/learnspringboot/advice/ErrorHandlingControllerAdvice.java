package com.csbd.learnspringboot.advice;

import com.csbd.learnspringboot.model.ValidationErrorResponse;
import com.csbd.learnspringboot.model.Violation;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandlingControllerAdvice {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ValidationErrorResponse onConstrainViolationException(ConstraintViolationException cve) {
        ValidationErrorResponse response = new ValidationErrorResponse();
        for(ConstraintViolation<?> violation : cve.getConstraintViolations()) {
            response.getViolations().add(new Violation(violation.getPropertyPath().toString(), violation.getMessage()));
        }
        return response;
    }
}
