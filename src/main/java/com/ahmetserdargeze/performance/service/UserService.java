package com.ahmetserdargeze.performance.service;

import com.ahmetserdargeze.performance.service.model.request.UserCreateServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserDeleteServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserFilterServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserListServiceRequest;
import com.ahmetserdargeze.performance.service.model.response.UserCreateServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserDeleteServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserFilterServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserListServiceResponse;

public interface UserService {

    UserListServiceResponse listUser(UserListServiceRequest serviceRequest);

    UserCreateServiceResponse createUser(UserCreateServiceRequest serviceRequest);

    UserFilterServiceResponse filterUser(UserFilterServiceRequest serviceRequest);

    UserDeleteServiceResponse deleteUser(UserDeleteServiceRequest serviceRequest);



    
}