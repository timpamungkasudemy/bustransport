package com.couse.security.application.api.request;

public record CreateCityRequest(
        String code,
        String name,
        String phoneCode,
        String countryCode) {
}
