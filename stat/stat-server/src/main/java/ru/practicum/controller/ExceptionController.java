package ru.practicum.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;

@RestControllerAdvice
@Slf4j
public class ExceptionController {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleThrowable(Throwable throwable) {
        log.error("Unexpected error occurred", throwable);
        StringWriter out = new StringWriter();
        throwable.printStackTrace(new PrintWriter(out));
        String stackTrace = out.toString();
        return new Error(throwable.getMessage(), stackTrace);
    }

    @AllArgsConstructor
    private static class Error {
        private String message;
        private String stackTrace;
    }
}
