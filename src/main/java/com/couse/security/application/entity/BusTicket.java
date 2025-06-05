package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bus_tickets")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update bus_tickets set deleted = true, deleted_at = now() "
        + " where bus_ticket_uuid = ?")
public class BusTicket {

    @Id
    @GeneratedValue
    private UUID busTicketUuid;

    @ManyToOne
    private BusRouteSchedule busRouteSchedule;

    @OneToMany(mappedBy = "busTicket", fetch = FetchType.LAZY)
    private List<BusTicketPassenger> passengers;

    private boolean canceled;
    private String ticketNumber;
    private OffsetDateTime issuedAt;
    private boolean paid;
    private boolean refunded;

    private UUID customerUuid;

    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

}