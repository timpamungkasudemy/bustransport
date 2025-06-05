package com.couse.security.application.api.response;

import java.time.OffsetDateTime;

import com.couse.security.application.entity.BusRouteSchedule.BusClass;

public record BusRouteScheduleResponse(
    BusRouteResponse busRoute,
    String code,
    String name,
    BusClass busClass,
    int capacity,
    OffsetDateTime departureTime,
    OffsetDateTime arrivalTime,
    int capacityAvailable,
    boolean isCapacityAvailable,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
