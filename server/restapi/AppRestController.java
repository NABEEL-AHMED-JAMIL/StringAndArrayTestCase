package com.ballistic.server.restapi;

import com.ballistic.server.pojo.rtb.BidRequest;
import com.ballistic.server.pojo.rtb.BidResponse;
import io.swagger.annotations.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

/**
 * Note:- handle home-page api
 * */
@RestController
@RequestMapping(value = "/app")
@Api(value="Server Management System API", description="Operations on Server.")
public class AppRestController {

    private APIResponse<?> apiResponse = null;

    // test=>done
    @ApiOperation(value = "Verify Server Active or Not", response = String.class)
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 404, message = "Not Found")})
    public String pingPong() {
        return "pong";
    }

    @ApiOperation(value = "Input Rtb-Request", response = BidResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 404, message = "Not Found")})
    @RequestMapping(value = "/save/account/local", method = RequestMethod.POST)
    public ResponseEntity<BidResponse> rtbRequestResponse(@NotBlank @NotBlank @RequestBody BidRequest request) {
        return new ResponseEntity<>(new BidResponse(), HttpStatus.OK);
    }

}
