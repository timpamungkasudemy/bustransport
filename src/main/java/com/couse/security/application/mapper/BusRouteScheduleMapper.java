package com.couse.security.application.mapper;

import com.couse.security.application.api.request.CreateBusRouteSchedule;
import com.couse.security.application.api.response.BusRouteScheduleResponse;
import com.couse.security.application.entity.BusRouteSchedule;
import com.couse.security.application.entity.BusRoute;
import org.mapstruct.*;
import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", uses = { BusRouteMapper.class })
public interface BusRouteScheduleMapper {

    @Mapping(target = "busRouteScheduleUuid", ignore = true)
    @Mapping(target = "busRoute", source = "busRouteUuid", qualifiedByName = "fromUuid")
    @Mapping(target = "busRouteScheduleCode", source = "code")
    @Mapping(target = "busRouteScheduleName", source = "name")
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "soldTickets", ignore = true)
    BusRouteSchedule toEntity(CreateBusRouteSchedule request);

    @Mapping(target = "busRouteScheduleUuid", source = "busRouteScheduleUuid")
    @Mapping(target = "busRoute", source = "busRoute")
    @Mapping(target = "code", source = "busRouteScheduleCode")
    @Mapping(target = "name", source = "busRouteScheduleName")
    @Mapping(target = "busClass", source = "busClass")
    @Mapping(target = "capacity", source = "capacity")
    @Mapping(target = "departureTime", source = "departureTime")
    @Mapping(target = "arrivalTime", source = "arrivalTime")
    @Mapping(target = "capacityAvailable", expression = "java(entity.getCapacityAvailable())")
    @Mapping(target = "isCapacityAvailable", expression = "java(entity.isCapacityAvailable())")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    BusRouteScheduleResponse toResponse(BusRouteSchedule entity);

    List<BusRouteScheduleResponse> toResponseList(List<BusRouteSchedule> entities);

    @Named("fromUuid")
    default BusRoute fromUuid(UUID uuid) {
        if (uuid == null) {
            return null;
        }

        var br = new BusRoute();
        br.setBusRouteUuid(uuid);
        return br;
    }

}
