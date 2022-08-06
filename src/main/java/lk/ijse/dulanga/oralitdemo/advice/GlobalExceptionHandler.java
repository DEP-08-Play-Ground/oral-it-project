package lk.ijse.dulanga.oralitdemo.advice;

import lk.ijse.dulanga.oralitdemo.service.exception.DuplicateException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(DuplicateException.class)
    public String handleDuplicateEmailException(DuplicateException e) {
        e.initCause(new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage(), e));
        return e.getMessage();
    }
}
