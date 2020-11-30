package com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEnvelope {
    private List<Notification> notifications;
}
