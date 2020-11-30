package com.cripto.modulararithmetic.interfaces.rest.exceptions;

import com.cripto.modulararithmetic.domain.model.exceptions.NotFoundException;
import com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error.NotificationEnvelope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.cripto.modulararithmetic.domain.model.helpers.ResponseError.createNotificationEnvelope;

@ControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<NotificationEnvelope> notFoundExceptionHandler(NotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(createNotificationEnvelope(e));
    }
}
