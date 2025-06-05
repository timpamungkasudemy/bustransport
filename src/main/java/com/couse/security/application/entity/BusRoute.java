package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "bus_routes")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update bus_service_points set deleted = true, deleted_at = now() "
        + " where bus_service_point_uuid = ?")
public class BusRoute {

    @Id
    @GeneratedValue
    private UUID busRouteUuid;

    @ManyToOne
    private BusServicePoint departureServicePoint;

    @ManyToOne
    private BusServicePoint arrivalServicePoint;

    private String busRouteCode;
    private String busRouteName;
    private String busRouteDescription;

    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    private boolean active;

}
