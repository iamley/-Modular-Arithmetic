package com.cripto.modulararithmetic.interfaces.rest;

import com.cripto.modulararithmetic.domain.model.entities.Response;
import com.cripto.modulararithmetic.domain.model.entities.Variables;
import com.cripto.modulararithmetic.domain.model.exceptions.NotFoundException;
import com.cripto.modulararithmetic.domain.usecases.SubtractionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subtraction")
public class SubtractionController {

    private final SubtractionUseCase subtractionUseCase;

    @PostMapping()
    public ResponseEntity<Response> getSubtraction(@RequestBody Variables variables) {
        return ResponseEntity.ok(subtractionUseCase.getSubtraction(variables).orElseThrow(NotFoundException::new));
    }
}
