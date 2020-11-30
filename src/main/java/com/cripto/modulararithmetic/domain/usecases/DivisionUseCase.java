package com.cripto.modulararithmetic.domain.usecases;

import com.cripto.modulararithmetic.domain.model.entities.Response;
import com.cripto.modulararithmetic.domain.model.entities.Variables;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class DivisionUseCase {
    public Optional<Response> getDivision(Variables variables) {
        Integer ab = variables.getA() / variables.getB();
        Integer mod = ab % variables.getMod();
        return Optional.of(Response.builder().res(mod).build());
    }
}
