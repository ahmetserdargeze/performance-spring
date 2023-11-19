package com.ahmetserdargeze.performance.service.model.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDeleteServiceRequest implements Serializable {
    private static final long serialVersionUID = 1388623973317630633L;

    private long id;
}
