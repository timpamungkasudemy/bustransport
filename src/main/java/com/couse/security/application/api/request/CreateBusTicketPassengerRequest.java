package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateBusTicketPassengerRequest(
    String seatNumber,
    String passengerName,
    String passengerPhone
) {
}
