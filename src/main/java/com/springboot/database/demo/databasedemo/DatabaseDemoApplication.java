package com.springboot.database.demo.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.database.demo.databasedemo.repository.PersonJbdcDao;


@SpringBootApplication
public class DatabaseDemoApplication   {
	private Logger log = LoggerFactory.getLogger(DatabaseDemoApplication.class);
	
	@Autowired
	PersonJbdcDao dao;
	


	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
		log.info("Get all users -> {}", dao.findAll());
		log.info("Get user by Id-> {}", dao.findById(10001));
		//log.info("Person data inserted -> {}",dao.insertPerson(new Person(10004,"Hassan","Riyadh",new Date())) );
		
		log.info("Person data inserted -> {}",dao.insertPerson(new Person(10004,"Zaki","Cairo",new Date())) );
	}*/

}
