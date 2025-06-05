package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bus_ticket_passengers")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update bus_ticket_passengers set deleted = true, deleted_at = now() "
        + " where bus_ticket_passenger_uuid = ?")
public class BusTicketPassenger {

    @Id
    @GeneratedValue
    private UUID busTicketPassengerUuid;

    private String seatNumber;
    private String passengerName;
    private String passengerPhone;

    @ManyToOne
    private BusTicket busTicket;

    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

}