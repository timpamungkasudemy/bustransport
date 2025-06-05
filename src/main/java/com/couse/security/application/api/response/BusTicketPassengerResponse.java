package com.couse.security.application.api.response;

public record BusTicketPassengerResponse(
    String seatNumber,
    String name,
    String phone
) {
}
