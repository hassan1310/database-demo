package com.springboot.database.demo.databasedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.demo.databasedemo.entity.Person;
import com.springboot.database.demo.databasedemo.service.PersonService;

@RestController
public class PersonRestController {
	
	@Autowired
	PersonService personService ;
	
	@GetMapping("/")
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@GetMapping("/{personId}")
	public Person findById(@PathVariable int personId) {
		return personService.findById(personId);
	}
	
	@GetMapping("/delete/{personId}")
	public int deleteById(@PathVariable int personId) {
		return personService.deleteById(personId);
	}

}
