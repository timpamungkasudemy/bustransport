package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "bus_route_schedules")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update bus_route_schedules set deleted = true, deleted_at = now() "
        + " where bus_route_schedule_uuid = ?")
public class BusRouteSchedule {
    
    public enum BusClass {
        STANDARD, EXECUTIVE, SUITE
    }

    @Id
    @GeneratedValue
    private UUID busRouteScheduleUuid;

    @ManyToOne
    private BusRoute busRoute;

    private String busRouteScheduleCode;
    private String busRouteScheduleName;

    private BusClass busClass;
    private int capacity;
    private OffsetDateTime departureTime;
    private OffsetDateTime arrivalTime;

    @OneToMany(mappedBy = "busRouteSchedule", cascade = CascadeType.ALL)
    private List<BusTicket> soldTickets;

    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    public int getCapacityAvailable() {
        if (Optional.ofNullable(soldTickets).isEmpty()) {
            return 0;
        }

        var activeTickets = (int) soldTickets.stream().filter(
            t -> t.isPaid() && !t.isCanceled()
        ).count();

        return capacity - activeTickets;
    }

    public boolean isCapacityAvailable() {
        return getCapacityAvailable() > 0;
    }

}
