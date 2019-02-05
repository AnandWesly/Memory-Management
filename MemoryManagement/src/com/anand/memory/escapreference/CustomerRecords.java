package com.anand.memory.escapreference;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{

	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<>();
	}

	public Map<String, Customer> getRecords() {
		return Collections.unmodifiableMap(this.records);
	}

	public void addRecords(Customer record) {
		this.records.put(record.name, record);
	}
	
	public void displayRecords(){
		for(Customer cust:records.values()){
			System.out.println("["+cust.id+","+cust.name+","+cust.DOB+"]");
		}
	}
	
	@Override
	public Iterator<Customer> iterator() {
		return this.records.values().iterator();
	}

	public CustomerReadOnly getCustByName(String name){
		return new Customer(records.get(name));
	}
}
