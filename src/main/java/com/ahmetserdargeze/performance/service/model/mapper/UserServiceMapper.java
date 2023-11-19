package com.ahmetserdargeze.performance.service.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ahmetserdargeze.performance.api.model.dto.UserDto;
import com.ahmetserdargeze.performance.dao.entity.UserDefinition;
import com.ahmetserdargeze.performance.service.model.response.UserCreateServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserDeleteServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserFilterServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserListServiceResponse;

@Mapper(componentModel = "spring")
public interface UserServiceMapper {
    UserDto toUserDto(UserDefinition user);

    UserDefinition toUserDefinition(UserDto userDto);

    List<UserDto> toUserDtoList(List<UserDefinition> user);

    default UserListServiceResponse toUserListServiceResponse(List<UserDefinition> users) {
        return UserListServiceResponse.builder()
                .users(toUserDtoList(users))
                .build();
    }

    default UserFilterServiceResponse toUserFilterServiceResponse(List<UserDefinition> users) {
        return UserFilterServiceResponse.builder()
                .users(toUserDtoList(users))
                .build();
    }


    UserCreateServiceResponse toUserCreateServiceResponse(Long id);

    UserDeleteServiceResponse toUserDeleteServiceResponse(Long id);

}
