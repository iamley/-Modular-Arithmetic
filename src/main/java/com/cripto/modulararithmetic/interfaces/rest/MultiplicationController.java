package com.cripto.modulararithmetic.interfaces.rest;

import com.cripto.modulararithmetic.domain.model.entities.Response;
import com.cripto.modulararithmetic.domain.model.entities.Variables;
import com.cripto.modulararithmetic.domain.model.exceptions.NotFoundException;
import com.cripto.modulararithmetic.domain.usecases.MultiplicationUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/multiplication")
public class MultiplicationController {

    private final MultiplicationUseCase multiplicationUseCase;

    @PostMapping()
    public ResponseEntity<Response> getMultiplication(@RequestBody Variables variables) {
        return ResponseEntity.ok(multiplicationUseCase.getMultiplication(variables).orElseThrow(NotFoundException::new));
    }
}
