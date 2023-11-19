package com.ahmetserdargeze.performance.dao.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserDefinition implements Serializable {

    private static final long serialVersionUID = -5826302811165983808L;

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String age;
}
