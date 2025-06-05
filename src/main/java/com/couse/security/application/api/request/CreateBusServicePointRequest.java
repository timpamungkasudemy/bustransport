package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateBusServicePointRequest(
        String code,
        String name,
        String address,
        boolean active,
        String countryCode,
        String cityCode,
        GeoPointRequest geoPoint) {
}
