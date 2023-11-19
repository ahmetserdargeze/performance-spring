package com.ahmetserdargeze.performance.api.model.mapper;

import org.mapstruct.Mapper;

import com.ahmetserdargeze.performance.api.model.request.UserDefinitionCreateApiRequest;
import com.ahmetserdargeze.performance.api.model.request.UserDefinitionDeleteApiRequest;
import com.ahmetserdargeze.performance.api.model.request.UserDefinitionFilterApiRequest;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionCreateApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionDeleteApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserDefinitionFilterApiResponse;
import com.ahmetserdargeze.performance.api.model.response.UserListApiResponse;
import com.ahmetserdargeze.performance.service.model.request.UserCreateServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserDeleteServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserFilterServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserListServiceRequest;
import com.ahmetserdargeze.performance.service.model.response.UserCreateServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserDeleteServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserFilterServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserListServiceResponse;

@Mapper(componentModel = "spring")
public interface UserApiMapper {

        UserListServiceRequest toUserListApiRequest(Integer page, Integer size);

        UserListApiResponse toUserListApiResponse(UserListServiceResponse userListServiceResponse);

        UserCreateServiceRequest toUserCreateServiceRequest(
                        UserDefinitionCreateApiRequest UserDefinitionCreateApiRequest);

        UserDefinitionCreateApiResponse toUserDefinitionCreateApiResponse(
                        UserCreateServiceResponse userCreateServiceResponse);

        UserFilterServiceRequest toUserFilterServiceRequest(
                        UserDefinitionFilterApiRequest userDefinitionFilterApiRequest);

        UserDefinitionFilterApiResponse toUserDefinitionFilterApiResponse(
                        UserFilterServiceResponse userFilterServiceResponse);

        UserDeleteServiceRequest toUserDeleteServiceRequest(
                        UserDefinitionDeleteApiRequest userDefinitionDeleteApiRequest);

        UserDefinitionDeleteApiResponse toUserDefinitionDeleteApiResponse(
                        UserDeleteServiceResponse userDeleteServiceResponse);

}