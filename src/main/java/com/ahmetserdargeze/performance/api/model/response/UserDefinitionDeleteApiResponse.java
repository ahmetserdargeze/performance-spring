package com.ahmetserdargeze.performance.api.model.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDefinitionDeleteApiResponse implements Serializable {
    private static final long serialVersionUID = -4259135471325056178L;

    private Long id;

}
