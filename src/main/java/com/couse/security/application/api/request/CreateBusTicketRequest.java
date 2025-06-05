package com.couse.security.application.api.request;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateBusTicketRequest(
    UUID busRouteScheduleUuid,
    List<CreateBusTicketPassengerRequest> passengers
) {}
