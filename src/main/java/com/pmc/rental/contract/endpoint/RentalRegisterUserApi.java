package com.pmc.rental.contract.endpoint;

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
@RequestMapping(path = RentalRegisterUserApi.REQUEST_MAPPING)
public interface RentalRegisterUserApi {

    String REQUEST_MAPPING = "/users";

    @Operation(summary = "Register as new user for adding the property or renting the property")
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<User> register(@RequestBody User user);

    @Operation(summary = "Update the existing user for adding the property or renting the property")
    @PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<User> update(@RequestBody User user);

    @Operation(summary = "Fetching the user")
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<User> fetch(@Parameter(name = "id") @RequestParam(value="id") String id);

    @Operation(summary = "Deleting the user")
    @DeleteMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses({@ApiResponse(responseCode = "200", description ="Success")})
    ResponseEntity<User> delete(@RequestBody User user);
}
