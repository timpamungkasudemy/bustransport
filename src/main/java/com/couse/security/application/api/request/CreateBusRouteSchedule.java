package com.couse.security.application.api.request;

import java.time.OffsetDateTime;
import java.util.UUID;

import com.couse.security.application.entity.BusRouteSchedule.BusClass;

public record CreateBusRouteSchedule(
        UUID busRouteUuid,
        String code,
        String name,
        BusClass busClass,
        int capacity,
        OffsetDateTime departureTime,
        OffsetDateTime arrivalTime) {
}
