package com.ahmetserdargeze.performance.service.impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ahmetserdargeze.performance.dao.repository.UserDefinitionRepository;
import com.ahmetserdargeze.performance.service.UserService;
import com.ahmetserdargeze.performance.service.model.mapper.UserServiceMapper;
import com.ahmetserdargeze.performance.service.model.request.UserCreateServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserDeleteServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserFilterServiceRequest;
import com.ahmetserdargeze.performance.service.model.request.UserListServiceRequest;
import com.ahmetserdargeze.performance.service.model.response.UserCreateServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserDeleteServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserFilterServiceResponse;
import com.ahmetserdargeze.performance.service.model.response.UserListServiceResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserServiceMapper userServiceMapper;

    private final UserDefinitionRepository userRepository;

    @Override
    public UserListServiceResponse listUser(UserListServiceRequest serviceRequest) {
        var userList = userRepository.findAll(PageRequest.of(serviceRequest.getPage(), serviceRequest.getSize()));
        return userServiceMapper.toUserListServiceResponse(userList.getContent());
    }

    @Override
    public UserCreateServiceResponse createUser(UserCreateServiceRequest serviceRequest) {
        var user = userServiceMapper.toUserDefinition(serviceRequest.getUser());
        user = userRepository.save(user);
        return userServiceMapper.toUserCreateServiceResponse(user.getId());
    }

    @Override
    public UserFilterServiceResponse filterUser(UserFilterServiceRequest serviceRequest) {
        var user = userServiceMapper.toUserDefinition(serviceRequest.getUser());
        var users = userRepository.findAll(Example.of(user));
        return userServiceMapper.toUserFilterServiceResponse(users);
    }

    @Override
    public UserDeleteServiceResponse deleteUser(UserDeleteServiceRequest serviceRequest) {
        userRepository.deleteById(serviceRequest.getId());
        return userServiceMapper.toUserDeleteServiceResponse(serviceRequest.getId());
    }

}
