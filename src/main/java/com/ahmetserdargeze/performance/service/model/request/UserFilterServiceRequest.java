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
public class UserFilterServiceRequest implements Serializable {
    private static final long serialVersionUID = -7705347331289981633L;

    private UserDto user;

}
