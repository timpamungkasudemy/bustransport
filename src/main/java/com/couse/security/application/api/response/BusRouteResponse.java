package com.couse.security.application.api.response;

import java.time.OffsetDateTime;

public record BusRouteResponse(
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
