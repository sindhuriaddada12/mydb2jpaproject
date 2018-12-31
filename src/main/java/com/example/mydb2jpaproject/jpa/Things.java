package com.example.mydb2jpaproject.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Things {
    @Id
    private Long id;
    private String name;

    public Things() {
    }

    @Override
    public String toString() {
        return String.format("Things[id=%d]", id);
    }
}