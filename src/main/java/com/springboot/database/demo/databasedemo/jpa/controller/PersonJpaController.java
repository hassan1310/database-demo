package com.springboot.database.demo.databasedemo.jpa.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.demo.databasedemo.jpa.entity.Person;
import com.springboot.database.demo.databasedemo.jpa.service.PersonJpaService;
import com.springboot.database.demo.databasedemo.springdata.repos.PersonspringDataRepo;

@RestController
public class PersonJpaController {
	
	@Autowired
	PersonJpaService personService;
	
	@Autowired
	PersonspringDataRepo personDao;
	
	@GetMapping("/jpa")
	public List<Person> findAll(){
		return personDao.findAll();
	}
	
	@GetMapping("/jpa/{personId}")
	public Person findById(@PathVariable int personId) {
		return personService.findById(personId);
	}
	
	@GetMapping("/jpa/insert")
	public Person findById() {
		return personService.insert(new Person("Hassan","Cairo",new Timestamp(new Date().getTime())));
	}
	
	@GetMapping("/jpa/delete/{personId}")
	public void deleteById(@PathVariable int personId) {
		 personService.deleteById(personId);
	}

	
}
