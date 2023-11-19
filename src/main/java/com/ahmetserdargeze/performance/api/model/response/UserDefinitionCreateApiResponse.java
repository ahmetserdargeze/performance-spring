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
public class UserDefinitionCreateApiResponse implements Serializable {
    private static final long serialVersionUID = 3436150457389489617L;

    private Long id;

}
