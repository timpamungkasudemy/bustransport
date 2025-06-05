package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;

import com.couse.security.application.entity.embeddable.GeoPoint;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bus_service_points")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update bus_service_points set deleted = true, deleted_at = now() "
        + " where bus_service_point_uuid = ?")
public class BusServicePoint {

    @Id
    @GeneratedValue
    private UUID busServicePointUuid;

    private String busServicePointCode;
    private String busServicePointName;
    private String busServicePointAddress;
    private boolean active;
    
    @Embedded
    private GeoPoint geoPoint;

    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

    private UUID cityUuid;
}
