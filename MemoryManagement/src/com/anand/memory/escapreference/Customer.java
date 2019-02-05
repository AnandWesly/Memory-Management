package com.anand.memory.escapreference;

import java.util.Date;

public class Customer implements CustomerReadOnly {

	int id;
	Date DOB;
	String name;
	
	public Customer(){
		
	}
	public Customer(Customer cust){
		this.id = cust.id;
		this.DOB = cust.DOB;
		this.name = cust.name;
	}
	
	/* (non-Javadoc)
	 * @see com.anand.memory.escapreference.CustomerReadOnly#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.anand.memory.escapreference.CustomerReadOnly#getDOB()
	 */
	@Override
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	/* (non-Javadoc)
	 * @see com.anand.memory.escapreference.CustomerReadOnly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
