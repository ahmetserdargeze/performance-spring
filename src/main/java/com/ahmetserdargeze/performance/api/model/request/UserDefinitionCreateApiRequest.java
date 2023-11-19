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
public class UserDefinitionCreateApiRequest implements Serializable {
    private static final long serialVersionUID = -5196618075334534965L;

    private UserDto user;

}
