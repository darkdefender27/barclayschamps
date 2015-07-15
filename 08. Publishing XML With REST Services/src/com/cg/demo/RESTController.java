package com.cg.demo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController

public class RESTController {

	@Autowired
	private PersonService service;
		
	@RequestMapping(value= {"/","/xml"},method=RequestMethod.GET)
	
	public  Persons returnXML(HttpServletResponse response){
		System.out.println("Method called");
		System.out.println(service.getOne());
		response.setContentType("application/json");
		return service.getOne();
	}
}