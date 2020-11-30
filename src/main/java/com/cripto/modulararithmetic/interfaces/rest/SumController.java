package com.cripto.modulararithmetic.interfaces.rest;

import com.cripto.modulararithmetic.domain.model.entities.Response;
import com.cripto.modulararithmetic.domain.model.entities.Variables;
import com.cripto.modulararithmetic.domain.model.exceptions.NotFoundException;
import com.cripto.modulararithmetic.domain.usecases.SumUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sum")
public class SumController {

    private final SumUseCase sumUseCase;

    @PostMapping()
    public ResponseEntity<Response> getSum(@RequestBody Variables variables) {
        return ResponseEntity.ok(sumUseCase.getSum(variables).orElseThrow(NotFoundException::new));
    }
}