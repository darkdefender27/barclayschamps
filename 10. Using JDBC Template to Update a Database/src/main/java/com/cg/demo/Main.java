package com.cg.demo;


import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("beanConfig.xml");
		ActorDAO actorDAO = context.getBean(ActorDAO.class);
		Actor a = new Actor();
		a.setFirstName("Amitabh");
		a.setLastName("Bachchan");
		//actorDAO.insert(a);
		
		System.out.println(actorDAO.findById(new Random().nextInt(200)));
	}

}
