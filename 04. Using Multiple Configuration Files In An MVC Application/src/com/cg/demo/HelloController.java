package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Autowired
	private Account account;
	@RequestMapping(value="/")
	public String sayHello(){
		System.out.println("Hello MVC "+account.getBalance());
		
		return "hello";
	}
}