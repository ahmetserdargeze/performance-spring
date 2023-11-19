package com.ahmetserdargeze.performance.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetserdargeze.performance.api.model.mapper.UserApiMapper;
import com.ahmetserdargeze.performance.api.model.request.UserDefinitionCreateApiRequest;
import com.ahmetserdargeze.performance.api.model.request.UserDefinitionDeleteApiRequest;
import com.ahmetserdargeze.performance.api.model.request.UserDefinitionFilterApiRequest;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionCreateApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionDeleteApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionFilterApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserListApiResponse;
import com.ahmetserdargeze.performance.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserApiMapper userApiMapper;

    private final UserService userService;

    @GetMapping(path = "/")
    ResponseEntity<UserListApiResponse> listUsers(@RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "100") int size) {

        var serviceRequest = userApiMapper.toUserListApiRequest(page, size);
        var serviceResponse = userService.listUser(serviceRequest);
        var apiResponse = userApiMapper.toUserListApiResponse(serviceResponse);

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);

    }

    @PostMapping("/")
    ResponseEntity<UserDefinitionCreateApiResponse> createUser(@RequestBody UserDefinitionCreateApiRequest request) {
        var serviceRequest = userApiMapper.toUserCreateServiceRequest(request);
        var serviceResponse = userService.createUser(serviceRequest);
        var apiResponse = userApiMapper.toUserDefinitionCreateApiResponse(serviceResponse);

        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping("/filter")
    ResponseEntity<UserDefinitionFilterApiResponse> createUser(@RequestBody UserDefinitionFilterApiRequest request) {
        var serviceRequest = userApiMapper.toUserFilterServiceRequest(request);
        var serviceResponse = userService.filterUser(serviceRequest);
        var apiResponse = userApiMapper.toUserDefinitionFilterApiResponse(serviceResponse);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("/")
    ResponseEntity<UserDefinitionDeleteApiResponse> createUser(@RequestBody UserDefinitionDeleteApiRequest request) {
        var serviceRequest = userApiMapper.toUserDeleteServiceRequest(request);
        var serviceResponse = userService.deleteUser(serviceRequest);
        var apiResponse = userApiMapper.toUserDefinitionDeleteApiResponse(serviceResponse);
        return new ResponseEntity<>(apiResponse, HttpStatus.NO_CONTENT);
    }

}
