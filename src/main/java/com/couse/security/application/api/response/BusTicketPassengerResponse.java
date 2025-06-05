package com.couse.security.application.api.response;

import java.time.OffsetDateTime;
import java.util.UUID;

public record BusTicketPassengerResponse(
    UUID busTicketPassengerUuid,
    String passengerName,
    String passengerDocument,
    OffsetDateTime createdAt,
    OffsetDateTime updatedAt
) {
}
