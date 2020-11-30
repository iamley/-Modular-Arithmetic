package com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notification implements Serializable {
    private String code;
    private String message;
    private String uuid;
    private LocalDateTime timestamp;
}
