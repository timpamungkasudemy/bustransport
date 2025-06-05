package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateCountryRequest(
        String code,
        String name,
        String currencyCode,
        String internationalPhoneCode) {
}
