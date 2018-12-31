package com.example.mydb2jpaproject.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Things {


    @javax.persistence.Id
    @GeneratedValue
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Things() {
    }

    @Override
    public String toString() {
        return String.format("Things[id=%d]", id);
    }



}