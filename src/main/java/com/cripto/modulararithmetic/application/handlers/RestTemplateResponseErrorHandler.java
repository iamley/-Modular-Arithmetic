package com.cripto.modulararithmetic.application.handlers;

import com.cripto.modulararithmetic.domain.model.exceptions.InternalServerException;
import com.cripto.modulararithmetic.domain.model.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().isError();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        createHandlerErrorMap()
                .computeIfAbsent(response.getStatusCode(), k -> {
                    throw new InternalServerException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
                }).handler();
    }

    private Map<HttpStatus, ResponseErrorFunction> createHandlerErrorMap() {
        Map<HttpStatus, ResponseErrorFunction> httpStatusResponseErrorFunctionHashMap = new HashMap<>();

        httpStatusResponseErrorFunctionHashMap.put(HttpStatus.NOT_FOUND, () -> {
            throw new NotFoundException(HttpStatus.NOT_FOUND.getReasonPhrase());
        });

        httpStatusResponseErrorFunctionHashMap.put(HttpStatus.INTERNAL_SERVER_ERROR, () -> {
            throw new InternalServerException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        });

        return httpStatusResponseErrorFunctionHashMap;
    }
}