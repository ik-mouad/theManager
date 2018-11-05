package com.ttu.gen.theManager.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ttu.gen.theManager.model.Person;
import com.ttu.gen.theManager.repository.PersonRepository;

@RestController
public class MPersonController {

	@Autowired
	PersonRepository personRepository;
	
	@PostMapping("person")
	public Person createPerson(@Valid @RequestBody Person person) {
		return personRepository.save(person); 
	}
	
	@GetMapping("person/{id}")
	public Optional<Person> getPerson(@PathVariable Long id) {
		return personRepository.findById(id);
	}

	@GetMapping("persons")
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

}
