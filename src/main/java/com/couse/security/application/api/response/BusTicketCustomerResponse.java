package com.couse.security.application.api.response;

public record BusTicketCustomerResponse(
    String name,
    String phoneNumber,
    String email
) {
}
