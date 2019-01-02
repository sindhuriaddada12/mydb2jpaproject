package com.example.mydb2jpaproject.controller;

import com.example.mydb2jpaproject.jpa.Repository;
import com.example.mydb2jpaproject.jpa.Things;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Example {
    @Autowired
    Repository repo;


    @RequestMapping("test")
    public Iterable<Things>  example() {

        return repo.findAll();
    }


    @RequestMapping(value = "test/sessionId/{name}", produces = {
            "application/JSON"
    })

    public List<Things> getThingsByName(@PathVariable String name) {

        repo.findByName(name);
        return repo.findByName(name);
    }




}



