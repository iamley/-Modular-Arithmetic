package com.cripto.modulararithmetic.domain.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Variables {
    private Integer a;
    private Integer b;
    private Integer mod;
}