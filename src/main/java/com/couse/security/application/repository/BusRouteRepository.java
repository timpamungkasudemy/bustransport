package com.couse.security.application.repository;

import com.couse.security.application.entity.BusRoute;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, UUID> {
}
