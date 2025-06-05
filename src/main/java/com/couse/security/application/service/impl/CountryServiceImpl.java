package com.couse.security.application.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.couse.security.application.api.request.CreateCountryRequest;
import com.couse.security.application.api.response.CountryDetailResponse;
import com.couse.security.application.repository.CityRepository;
import com.couse.security.application.repository.CountryRepository;
import com.couse.security.application.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{
    
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;

    public CountryServiceImpl(CountryRepository countryRepository, CityRepository cityRepository) {
        this.countryRepository = countryRepository;
        this.cityRepository = cityRepository;
    }

    @Override
    public Optional<CountryDetailResponse> findByCountryCode(String countryCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCountryCode'");
    }

    @Override
    public Optional<CountryDetailResponse> findByCountryName(String countryName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCountryName'");
    }

    @Override
    public List<CountryDetailResponse> findAllCountries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllCountries'");
    }

    @Override
    public UUID createCountry(CreateCountryRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCountry'");
    }

    @Override
    public boolean softDeleteCountry(String countryCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'softDeleteCountry'");
    }

}
