package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.UUID;

public record CustomerResponse(
    UUID customerUUID,
    String customerName,
    String email,
    String phoneNumber,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
