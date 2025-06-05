package com.couse.security.application.repository;

import com.couse.security.application.entity.BusServicePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusServicePointRepository extends JpaRepository<BusServicePoint, Long> {
}
