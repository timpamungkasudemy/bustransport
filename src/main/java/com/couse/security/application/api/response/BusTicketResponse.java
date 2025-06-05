package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.List;

public record BusTicketResponse(
    String ticketNumber,
    BusRouteScheduleResponse busRouteSchedule,
    BusTicketCustomerResponse customer,
    List<BusTicketPassengerResponse> passengers, 
    OffsetDateTime issuedAt,
    boolean paid,
    boolean canceled,
    boolean refunded,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
