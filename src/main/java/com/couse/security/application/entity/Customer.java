package com.couse.security.application.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customers")
@Entity
@FilterDef(name = "deletedFilter", defaultCondition = "deleted = false")
@Filter(name = "deletedFilter")
@SQLDelete(sql = "update customers set deleted = true, deleted_at = now() where customer_uuid = ?")
public class Customer {

    @Id
    @GeneratedValue
    private UUID customerUUID;

    private String customerName;
    private String email;
    private String phoneNumber;

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private Boolean deleted;
    private OffsetDateTime deletedAt;

}