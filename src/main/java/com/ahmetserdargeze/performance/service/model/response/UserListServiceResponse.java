package com.ahmetserdargeze.performance.service.model.response;

import java.io.Serializable;
import java.util.List;

import com.ahmetserdargeze.performance.api.model.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserListServiceResponse implements Serializable{
    private static final long serialVersionUID = 7930958307451572690L;

    private List<UserDto> users;
}
