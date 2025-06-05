package com.couse.security.application.api.request;

import java.util.UUID;

public record CreateBusRouteRequest(
        UUID departureServicePointUuid,
        UUID arrivalServicePointUuid,
        String code,
        String name,
        String description,
        boolean active) {
}
