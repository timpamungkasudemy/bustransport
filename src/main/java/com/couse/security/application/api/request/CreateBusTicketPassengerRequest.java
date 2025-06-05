package com.couse.security.application.api.request;

public record CreateBusTicketPassengerRequest(
    String seatNumber,
    String passengerName,
    String passengerPhone
) {
}
