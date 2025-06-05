package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
@Table(name = "countries")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update countries set deleted = true, deleted_at = now() "
        + "where country_uuid = ?")
public class Country {

    @Id
    @GeneratedValue
    private UUID countryUuid;

    private String countryCode;
    private String countryName;
    private String currencyCode;
    private String internationalPhoneCode;
    
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime deletedAt;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

}