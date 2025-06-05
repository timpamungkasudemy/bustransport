package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import com.couse.security.application.api.response.BusTicketPassengerResponse;

public record BusTicketResponse(
    UUID busTicketUuid,
    BusRouteScheduleResponse busRouteSchedule,
    List<BusTicketPassengerResponse> passengers, // This will require BusTicketPassengerResponse
    boolean canceled,
    String ticketNumber,
    OffsetDateTime issuedAt,
    boolean paid,
    boolean refunded,
    UUID customerUuid,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
