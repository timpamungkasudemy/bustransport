package com.couse.security.application.mapper;

import java.util.List;
import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.couse.security.application.api.request.CreateBusRouteRequest;
import com.couse.security.application.api.response.BusRouteResponse;
import com.couse.security.application.entity.BusRoute;
import com.couse.security.application.entity.BusServicePoint;

@Mapper(componentModel = "spring", uses = { BusServicePointMapper.class })
public interface BusRouteMapper {

    @Mapping(target = "busRouteUuid", ignore = true)
    @Mapping(target = "departureServicePoint", source = "departureServicePointUuid", qualifiedByName = "fromUuid")
    @Mapping(target = "arrivalServicePoint", source = "arrivalServicePointUuid", qualifiedByName = "fromUuid")
    @Mapping(target = "busRouteCode", source = "code")
    @Mapping(target = "busRouteName", source = "name")
    @Mapping(target = "busRouteDescription", source = "description")
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    BusRoute toEntity(CreateBusRouteRequest request);

    @Mapping(target = "busRouteUuid", source = "busRouteUuid")
    @Mapping(target = "departure", source = "departureServicePoint")
    @Mapping(target = "arrival", source = "arrivalServicePoint")
    @Mapping(target = "code", source = "busRouteCode")
    @Mapping(target = "name", source = "busRouteName")
    @Mapping(target = "description", source = "busRouteDescription")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    @Mapping(target = "active", source = "active")
    BusRouteResponse toResponse(BusRoute entity);

    List<BusRouteResponse> toResponseList(List<BusRoute> entities);

    @Named("fromUuid")
    default BusServicePoint fromUuid(UUID uuid) {
        if (uuid == null) {
            return null;
        }

        var bsp = new BusServicePoint();
        bsp.setBusServicePointUuid(uuid);
        return bsp;
    }
}
