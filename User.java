package com.elevateLabs;

public class User extends Person {
	private int id;

	public User(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void displayInfo() {
		System.out.println("User: "+ name + " [id=" + id + "]");;
	}


	
	
}
