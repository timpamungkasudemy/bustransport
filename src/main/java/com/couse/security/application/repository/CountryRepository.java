package com.couse.security.application.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.couse.security.application.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, UUID> {
    Optional<Country> findByCountryCodeAndDeletedFalse(String countryCode);
    Optional<Country> findByCountryNameAndDeletedFalse(String countryName);
    List<Country> findAllByDeletedFalse();
}
