package com.couse.security.application.repository;

import com.couse.security.application.entity.BusTicket;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusTicketRepository extends JpaRepository<BusTicket, UUID> {
}
