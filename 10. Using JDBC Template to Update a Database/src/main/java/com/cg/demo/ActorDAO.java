package com.cg.demo;

import java.util.List;

public interface ActorDAO {
	public void insert(Actor actor);
	public List<Actor> findByFirstName(String firstName);
	public Actor findById(int id);
}
