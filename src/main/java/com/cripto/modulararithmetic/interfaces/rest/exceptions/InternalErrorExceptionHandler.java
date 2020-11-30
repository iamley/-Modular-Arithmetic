package com.cripto.modulararithmetic.interfaces.rest.exceptions;

import com.cripto.modulararithmetic.domain.model.exceptions.InternalServerException;
import com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error.NotificationEnvelope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.cripto.modulararithmetic.domain.model.helpers.ResponseError.createNotificationEnvelope;

@ControllerAdvice
public class InternalErrorExceptionHandler {

    @ExceptionHandler(InternalServerException.class)
    public final ResponseEntity<NotificationEnvelope> internalExceptionHandler(InternalServerException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(createNotificationEnvelope(e));
    }
}
