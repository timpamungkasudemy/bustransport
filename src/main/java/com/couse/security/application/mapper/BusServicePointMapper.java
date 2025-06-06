package com.couse.security.application.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.couse.security.application.api.request.CreateBusServicePointRequest;
import com.couse.security.application.api.response.BusServicePointResponse;
import com.couse.security.application.entity.BusServicePoint;

@Mapper(componentModel = "spring")
public interface BusServicePointMapper {

    @Mapping(target = "busServicePointUuid", ignore = true)
    @Mapping(target = "busServicePointCode", source = "code")
    @Mapping(target = "busServicePointName", source = "name")
    @Mapping(target = "busServicePointAddress", source = "address")
    @Mapping(target = "geoPoint", source = "geoPoint")
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "cityUuid", ignore = true) // You may want to set this elsewhere
    BusServicePoint toEntity(CreateBusServicePointRequest request);

    @Mapping(target = "code", source = "busServicePointCode")
    @Mapping(target = "name", source = "busServicePointName")
    @Mapping(target = "address", source = "busServicePointAddress")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    @Mapping(target = "active", source = "active")
    @Mapping(target = "cityCode", ignore = true)
    @Mapping(target = "cityName", ignore = true)
    BusServicePointResponse toResponse(BusServicePoint entity);

    List<BusServicePointResponse> toResponseList(List<BusServicePoint> entities);

}
