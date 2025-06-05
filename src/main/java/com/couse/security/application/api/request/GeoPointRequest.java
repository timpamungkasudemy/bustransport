package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GeoPointRequest(
        double latitude,
        double longitude) {
}