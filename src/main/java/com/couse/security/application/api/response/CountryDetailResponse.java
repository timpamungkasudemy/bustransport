package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.List;

public record CountryDetailResponse(
    String code,
    String name,
    String currencyCode,
    String internationalPhoneCode,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt,
    List<CountryCityResponse> cities
) {
}