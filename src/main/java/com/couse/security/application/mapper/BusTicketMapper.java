package com.couse.security.application.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.couse.security.application.api.request.CreateBusTicketRequest;
import com.couse.security.application.api.response.BusTicketResponse;
import com.couse.security.application.entity.BusTicket;

@Mapper(componentModel = "spring")
public interface BusTicketMapper {

    @Mapping(target = "busTicketUuid", ignore = true)
    @Mapping(target = "busRouteSchedule", ignore = true)
    @Mapping(target = "passengers", ignore = true)
    @Mapping(target = "canceled", ignore = true)
    @Mapping(target = "ticketNumber", ignore = true)
    @Mapping(target = "issuedAt", ignore = true)
    @Mapping(target = "paid", ignore = true)
    @Mapping(target = "refunded", ignore = true)
    @Mapping(target = "customerUuid", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    BusTicket toEntity(CreateBusTicketRequest request);

    @Mapping(target = "busRouteSchedule", ignore = true)
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "passengers", ignore = true)
    BusTicketResponse toResponse(BusTicket entity);

    List<BusTicketResponse> toResponseList(List<BusTicket> entities);
}