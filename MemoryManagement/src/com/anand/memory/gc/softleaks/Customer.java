package com.anand.memory.gc.softleaks;

public class Customer {

	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id + " : " + name;
	}
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	
}

