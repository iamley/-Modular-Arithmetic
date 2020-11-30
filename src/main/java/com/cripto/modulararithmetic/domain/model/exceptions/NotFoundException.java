package com.cripto.modulararithmetic.domain.model.exceptions;

public class NotFoundException extends ApplicationException {
    public NotFoundException() { }

    public NotFoundException(String message) {
        super(message);
    }
}