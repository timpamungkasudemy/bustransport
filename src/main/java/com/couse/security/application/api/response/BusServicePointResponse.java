package com.couse.security.application.api.response;

import java.time.OffsetDateTime;

public record BusServicePointResponse(
    String code,
    String name,
    String address,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt,
    boolean active,
    String cityCode,
    String cityName
) {
}
