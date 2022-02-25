package com.springboot.database.demo.databasedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.database.demo.databasedemo.entity.Person;
import com.springboot.database.demo.databasedemo.repository.PersonJbdcDao;

@Service
public class PersonService {
	
	@Autowired
	PersonJbdcDao personJbdcDao;
	
	public List<Person> findAll() {
		return personJbdcDao.findAll();
	}
	
	public Person findById(int id) {
		return personJbdcDao.findById(id);
	}
	
	public int deleteById(int id) {
		return personJbdcDao.deleteById(id);
	}
	
	
	

}
