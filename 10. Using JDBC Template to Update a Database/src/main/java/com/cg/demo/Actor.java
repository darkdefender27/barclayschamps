package com.cg.demo;

public class Actor {

	private int actorId;
	private String firstName;
	private String lastName;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int id) {
		this.actorId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Actor [id=" + actorId + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
}