package com.ahmetserdargeze.performance.api.model.response;

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
public class UserListApiResponse {
    private List<UserDto> users;
}
