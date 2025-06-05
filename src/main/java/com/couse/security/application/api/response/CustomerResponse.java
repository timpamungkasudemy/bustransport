package com.couse.security.application.api.response;

import java.time.OffsetDateTime;

public record CustomerResponse(
    String customerName,
    String email,
    String phoneNumber,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
