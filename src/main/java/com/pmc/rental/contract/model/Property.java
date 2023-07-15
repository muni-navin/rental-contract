package com.pmc.rental.contract.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    @Schema(description = "Property unique identifier in the database")
    Long id;

    @Schema(description = "Name of the property")
    String propertyName;

    @Schema(description = "Description of the property")
    String description;

    @Schema(description = "Complete address of the property")
    String address;

    @Schema(description = "City of the property located")
    String city;

    @Schema(description = "State of the property located")
    String state;

    @Schema(description = "Zip of the property located")
    String zipCode;

    @Schema(description = "Total rooms available")
    Integer numberOfRooms;

    @Schema(description = "Price of the property")
    Integer rentalPrice;
}
