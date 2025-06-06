package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateCityRequest(
                String code,
                String name,
                String phoneCode,
                String countryCode) {
}
