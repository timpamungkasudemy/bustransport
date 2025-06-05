package com.couse.security.application.api.response;

import com.couse.security.application.entity.BusRouteSchedule.BusClass;
import java.time.OffsetDateTime;
import java.util.UUID;

public record BusRouteScheduleResponse(
    UUID busRouteScheduleUuid,
    BusRouteResponse busRoute,
    String busRouteScheduleCode,
    String busRouteScheduleName,
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
