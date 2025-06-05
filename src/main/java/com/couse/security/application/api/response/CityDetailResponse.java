package com.couse.security.application.api.response;

import java.time.OffsetDateTime;

public record CityDetailResponse(
     String countryCode,
     String countryName,
     String code,
     String name,
     String phoneCode,
     OffsetDateTime createdAt,
     OffsetDateTime updatedAt) {
}