package com.ahmetserdargeze.performance.api.model.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDefinitionDeleteApiRequest implements Serializable {
    private static final long serialVersionUID = 77254961929211918L;

    private Long id;

}
