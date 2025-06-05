
package com.couse.security.application.api.request;

public record CustomerRequest(
        String name,
        String email,
        String phoneNumber) {
}
