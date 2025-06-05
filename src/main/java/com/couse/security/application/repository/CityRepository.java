package com.couse.security.application.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.couse.security.application.entity.City;

public interface  CityRepository  extends PagingAndSortingRepository<City, UUID> {

}
