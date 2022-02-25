package com.springboot.database.demo.databasedemo.springdata.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.database.demo.databasedemo.jpa.entity.Person;


@Repository
public interface PersonspringDataRepo extends JpaRepository<Person, Integer>{

}
