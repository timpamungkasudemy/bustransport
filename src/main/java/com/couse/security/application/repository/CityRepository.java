package com.couse.security.application.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.couse.security.application.entity.City;

@Repository
public interface  CityRepository  extends PagingAndSortingRepository<City, UUID> {

}
