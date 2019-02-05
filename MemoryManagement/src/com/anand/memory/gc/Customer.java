package com.anand.memory.gc;

public class Customer {
	
	private int id ;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void finalize(){
		System.out.println("This Object being GC!!");
	}
	

}
