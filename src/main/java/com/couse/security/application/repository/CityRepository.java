package com.couse.security.application.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.couse.security.application.entity.City;

@Repository
public interface  CityRepository  extends JpaRepository<City, UUID> {

}
