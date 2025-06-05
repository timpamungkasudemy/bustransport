package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.UUID;

public record BusRouteResponse(
    UUID busRouteUuid,
    BusServicePointResponse departureServicePoint,
    BusServicePointResponse arrivalServicePoint,
    String busRouteCode,
    String busRouteName,
    String busRouteDescription,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt,
    boolean active
) {
}
