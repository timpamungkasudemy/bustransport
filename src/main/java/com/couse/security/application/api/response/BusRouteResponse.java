package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.UUID;

public record BusRouteResponse(
    UUID busRouteUuid,
    BusServicePointResponse departure,
    BusServicePointResponse arrival,
    String code,
    String name,
    String description,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt,
    boolean active
) {
}
