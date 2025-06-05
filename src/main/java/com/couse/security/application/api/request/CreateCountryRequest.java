package com.couse.security.application.api.request;

public record CreateCountryRequest(
        String code,
        String name,
        String currencyCode,
        String internationalPhoneCode) {
}
