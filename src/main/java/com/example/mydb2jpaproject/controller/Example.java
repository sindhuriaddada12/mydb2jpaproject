package com.example.mydb2jpaproject.controller;

import com.example.mydb2jpaproject.jpa.Repository;
import com.example.mydb2jpaproject.jpa.Things;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Example {


    @Autowired
    Repository repo;


    @RequestMapping("test")
    public @ResponseBody
    ResponseEntity<String> example() {
        List<String> list = new ArrayList<>();
        list.add("Table data...");
        for (Things things : repo.findAll()) {
            list.add(things.toString());
        }
        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }

    @RequestMapping("test/name/{name}")
    public List<Things> getThingsByName(@PathVariable String name) {

        repo.findByName(name);
        return repo.findByName(name);
    }

    @RequestMapping("test/id/{id}")
    public Optional<Things> getThingsById(@PathVariable Long id) {

        return repo.findById(id);
    }

}



