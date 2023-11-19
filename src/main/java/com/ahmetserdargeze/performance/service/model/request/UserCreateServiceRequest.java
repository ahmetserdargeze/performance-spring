package com.ahmetserdargeze.performance.service.model.request;

import java.io.Serializable;

import com.ahmetserdargeze.performance.api.model.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateServiceRequest implements Serializable {
    private static final long serialVersionUID = -7449232390713542092L;

    private UserDto user;

}
