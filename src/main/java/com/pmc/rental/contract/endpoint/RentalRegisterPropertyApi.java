package com.pmc.rental.contract.endpoint;

import com.pmc.rental.contract.model.Property;
import com.pmc.rental.contract.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = RentalRegisterPropertyApi.REQUEST_MAPPING)
public interface RentalRegisterPropertyApi {

    String REQUEST_MAPPING = "/properties";

    @Operation(summary = "Register the new property")
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<Property> registerProperty(@RequestBody Property property);

    @Operation(summary = "Updating the property")
    @PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<Property> updateProperty(@RequestBody Property property);

    @Operation(summary = "Fetching the property")
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<Property> fetchProperty(@Parameter(name = "id") @RequestParam(value="id") String id);

    @Operation(summary = "Deleting the property")
    @DeleteMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<Property> deleteProperty(@RequestBody Property property);
}
