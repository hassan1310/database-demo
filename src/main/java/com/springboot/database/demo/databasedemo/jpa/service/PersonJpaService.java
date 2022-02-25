package com.springboot.database.demo.databasedemo.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.database.demo.databasedemo.jpa.entity.Person;
import com.springboot.database.demo.databasedemo.jpa.repos.PersonJpaRepository;

@Service
public class PersonJpaService {
	
	@Autowired
	PersonJpaRepository personRepository;
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	public Person findById(int id) {
		return personRepository.findById(id);
	}
	
	public Person insert (Person person) {
		return personRepository.insert(person);
	}
	
	public void deleteById (int id) {
		personRepository.deleteById(id);
	}

}
