package com.couse.security.application.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.couse.security.application.api.request.CreateBusTicketPassengerRequest;
import com.couse.security.application.api.response.BusTicketPassengerResponse;
import com.couse.security.application.entity.BusTicketPassenger;

@Mapper(componentModel = "spring")
public interface BusTicketPassengerMapping {
    BusTicketPassengerMapping INSTANCE = Mappers.getMapper(BusTicketPassengerMapping.class);

    @Mapping(target = "busTicket", ignore = true)
    @Mapping(target = "busTicketPassengerUuid", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    BusTicketPassenger toEntity(CreateBusTicketPassengerRequest request);

    @Mapping(source = "passengerName", target = "name")
    @Mapping(source = "passengerPhone", target = "phone")
    BusTicketPassengerResponse toResponse(BusTicketPassenger entity);

    List<BusTicketPassengerResponse> toResponseList(List<BusTicketPassenger> entities);
}
