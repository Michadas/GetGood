package org.example.controllers;

import io.swagger.annotations.*;
import org.example.responses.OkResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Simple app.")
public class GetController {

    @ApiOperation(value = "Method return string.")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success", response = OkResponse.class)
    })
    @GetMapping(value = "/response")
    public ResponseEntity<OkResponse> postApplications(
            @ApiParam(hidden = true)
            @RequestHeader HttpHeaders headers
            ) {
        return new ResponseEntity<>(new OkResponse("Brave new container world."),HttpStatus.OK);
    }

}
