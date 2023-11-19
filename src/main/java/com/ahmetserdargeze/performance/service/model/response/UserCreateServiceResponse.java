package com.ahmetserdargeze.performance.service.model.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateServiceResponse implements Serializable{
    private static final long serialVersionUID = -2018227734943636440L;

    private Long id;

}
