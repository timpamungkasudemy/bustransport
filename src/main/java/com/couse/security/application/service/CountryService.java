package com.couse.security.application.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.couse.security.application.api.request.CreateCountryRequest;
import com.couse.security.application.api.response.CountryDetailResponse;

public interface CountryService {

    Optional<CountryDetailResponse> findByCountryCode(String countryCode);
    Optional<CountryDetailResponse> findByCountryName(String countryName);
    List<CountryDetailResponse> findAllCountries();
    UUID createCountry(CreateCountryRequest request);
    boolean softDeleteCountry(String countryCode);

}
