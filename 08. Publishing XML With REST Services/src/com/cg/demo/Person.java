package com.cg.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Person {

	private String name;
	@XmlElement
	private City city;
	public Person(){}
	
	public Person(String name){
		this.name=name;
	}
	
	public Person(String name, City city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}

	
	public City getCity() {
		return city;
	}
	
	
	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
}
