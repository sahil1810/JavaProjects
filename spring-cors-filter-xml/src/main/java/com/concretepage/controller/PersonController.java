package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.domain.Person;
import com.concretepage.service.PersonService;
@RestController
@RequestMapping("info")
public class PersonController {
	@Autowired
	private PersonService service;
	@RequestMapping("home")
	@CrossOrigin(exposedHeaders= {"sahil"})
	public List<Person> showData() {
		List<Person> list = service.getAllPerson();
		return list;
 	}
}
