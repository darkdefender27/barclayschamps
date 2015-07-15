package com.cg.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	public Persons getOne(){
		
		List<Person> ls = new ArrayList<Person>();
		ls.add(new Person("Sagar", new City("Pune")));
		ls.add(new Person("Kalyan", new City("Hyd")));
		ls.add(new Person("Saurabh", new City("Lucknow")));
		ls.add(new Person("Santosh", new City("Bangalore")));
		Persons p = new Persons();
		p.setPersons(ls);

		return p;
	}
	
}
