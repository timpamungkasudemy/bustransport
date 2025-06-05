package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.UUID;

public record BusServicePointResponse(
    UUID servicePointUuid,
    String servicePointName,
    String servicePointAddress,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt,
    boolean active
) {
}
