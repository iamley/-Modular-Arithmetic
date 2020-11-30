package com.cripto.modulararithmetic.domain.model.helpers;

import com.cripto.modulararithmetic.domain.model.exceptions.ApplicationException;
import com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error.Notification;
import com.cripto.modulararithmetic.infrastructure.driven_adapters.dtos.error.NotificationEnvelope;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.UUID;

public final class ResponseError {

    public static NotificationEnvelope createNotificationEnvelope(ApplicationException e) {
        return new NotificationEnvelope(Collections.singletonList(
                notificationBuilder(e).build()
        ));
    }

    public static NotificationEnvelope createNotificationEnvelope(ApplicationException e, String code) {
        return new NotificationEnvelope(Collections.singletonList(
                notificationBuilder(e)
                        .code(code)
                        .build()
        ));
    }

    private static Notification.NotificationBuilder notificationBuilder(ApplicationException e) {
        return Notification.builder()
                .message(e.getMessage())
                .uuid(UUID.randomUUID().toString())
                .timestamp(LocalDateTime.now());
    }
}