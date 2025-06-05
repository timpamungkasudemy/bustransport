package com.couse.security.application.api.request;

import java.util.List;
import java.util.UUID;


public record CreateBusTicketRequest(
    UUID busRouteScheduleUuid,
    List<CreateBusTicketPassengerRequest> passengers
) {}
