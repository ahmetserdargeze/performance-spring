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
public class UserFilterServiceResponse implements Serializable {
    private static final long serialVersionUID = -8218923708461128769L;
    private List<UserDto> users;
}
