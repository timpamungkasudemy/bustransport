package com.couse.security.application.api.request;

public record CreateBusServicePointRequest(
        String code,
        String name,
        String address,
        boolean active,
        String countryCode,
        String cityCode,
        GeoPointRequest geoPoint) {
}
