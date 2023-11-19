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
public class UserDeleteServiceResponse implements Serializable {
    private static final long serialVersionUID = -2945897897468402567L;

    private long id;
}
