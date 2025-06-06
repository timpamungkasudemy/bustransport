
package com.couse.security.application.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CreateCustomerRequest(
                String name,
                String email,
                String phoneNumber) {
}
