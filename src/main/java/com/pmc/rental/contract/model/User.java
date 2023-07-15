package com.pmc.rental.contract.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Schema(description = "User unique identifier in the database")
    Long id;
    @Schema(description = "Property owner or Tenant username")
    String userName;
    @Schema(description = "Property owner or Tenant password")
    String password;
    @Schema(description = "Property owner or Tenant email")
    String email;
    @Schema(description = "Property owner or Tenant firstname")
    String firstName;
    @Schema(description = "Property owner or Tenant lastname")
    String lastName;
    @Schema(description = "Property owner or Tenant phone number")
    String phoneNumber;
    @Schema(description = "Property owner or Tenant country code")
    String countryCode;
    @Schema(description = "Property owner or Tenant address")
    String address;
    @Schema(description = "Property owner or Tenant city")
    String city;
    @Schema(description = "Property owner or Tenant state")
    String state;
    @Schema(description = "Property owner or Tenant zip code")
    String zipCode;
    @Schema(description = "Properties owned by user")
    Set<Property> properties;
}
