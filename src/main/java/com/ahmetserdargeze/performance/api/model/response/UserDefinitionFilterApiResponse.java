package com.ahmetserdargeze.performance.api.model.response;

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
public class UserDefinitionFilterApiResponse implements Serializable {
    private static final long serialVersionUID = -5494717686561697139L;

    private List<UserDto> users;
}
