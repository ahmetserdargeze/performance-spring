package com.ahmetserdargeze.performance.api.model.request;

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
public class UserDefinitionFilterApiRequest implements Serializable {
    private static final long serialVersionUID = -2507408650404889056L;

    private UserDto user;

}
