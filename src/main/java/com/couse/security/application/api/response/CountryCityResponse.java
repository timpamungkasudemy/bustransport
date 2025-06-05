package com.couse.security.application.api.response;

public record CountryCityResponse (
    String code,
    String name,
    String phoneCode
) {
}
