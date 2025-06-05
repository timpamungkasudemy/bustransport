package com.couse.security.application.api.request;

public record GeoPointRequest(
        double latitude,
        double longitude) {
}