package com.anand.memory.gc.softleaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerManager {

	private List<Customer> customers = new ArrayList<Customer>();
	private int nextId = 0;

	public void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextId);
			nextId++;
		}
		customers.add(customer);
	}

	public Customer getNextCustomer() {
		// should do:
		// customers.remove(0);
		Customer cust = null;

		synchronized (this) {
			if (customers.size() > 0) {
				cust = customers.remove(0);
			}
		}
		return cust;
	}

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("" + new Date() + " : " + size);
	}

	public void displayCustomers() {
		synchronized (customers) {
			for (Customer c : customers) {
				System.out.println(c.toString());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
