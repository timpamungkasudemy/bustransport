package com.couse.security.application.repository;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.couse.security.application.entity.Country;

public interface CountryRepository extends PagingAndSortingRepository<Country, UUID> {
    Optional<Country> findByCountryCodeAndDeletedFalse(String countryCode);
    Optional<Country> findByCountryNameAndDeletedFalse(String countryName);
    List<Country> findAllByDeletedFalse();
}
