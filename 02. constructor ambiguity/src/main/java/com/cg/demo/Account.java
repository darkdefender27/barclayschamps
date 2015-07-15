package com.cg.demo;

import java.beans.ConstructorProperties;

public class Account {

	private int balance;
	private String type;
	private int number;
	{
		System.out.println("Account object is being constructed!");
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int balance, String type) {
		super();
		this.balance = balance;
		this.type = type;
	}

	@ConstructorProperties({"type","number"})
	public Account(String type, int number) {
		super();
		this.type = type;
		this.number = number;
	}

	public Account(int number, int balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", type=" + type + ", number="
				+ number + "]";
	}
	
	
}
