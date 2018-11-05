package com.ttu.gen.theManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttu.gen.theManager.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
