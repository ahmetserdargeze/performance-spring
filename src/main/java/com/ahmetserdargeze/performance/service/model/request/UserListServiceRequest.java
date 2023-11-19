package com.ahmetserdargeze.performance.service.model.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserListServiceRequest implements Serializable {
    private static final long serialVersionUID = 448459542933882392L;

    private int page;

    private int size;

}