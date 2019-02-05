package com.anand.memory.escapreference;

import java.util.Calendar;
import java.util.Iterator;

public class EscapeReferenceFix {

	public static void main(String[] args) {
		CustomerRecords customerRecords = new CustomerRecords();
		Customer customer = new Customer();
		Calendar calinstnace = Calendar.getInstance();
		calinstnace.set(1989, 8, 21);
		customer.id = 1;
		customer.name = "Anand";
		customer.DOB = calinstnace.getTime();
		customerRecords.addRecords(customer);

		Customer customer1 = new Customer();
		calinstnace.set(1989, 8, 21);
		customer1.id = 2;
		customer1.name = "Wesly";
		customer1.DOB = calinstnace.getTime();
		customerRecords.addRecords(customer1);
		customerRecords.displayRecords();
		// By accessing the clear method we can completely clear the record
		// list.
		// customerRecords.getRecords().clear();
		customerRecords.displayRecords();

		// 1.To fix this we can implement the Iteratable and override the Iterator
		// method to return only the Values
		// Lets see this fix the issue or not
		Iterator<Customer> iterator = customerRecords.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			//iterator.remove();
			break;
		}
		customerRecords.displayRecords();
		//by using Iterator we are able to remove the records ..so this is not completly worked
		//2. Lets try returning the new instance of the hashmap..
		//Through this fix yes we are sending new reference of the hashmap but the acutally object inside hasmap value 
		//would be same as the original one so one can mutate the same.
	//	customerRecords.getRecords().clear(); 
		//This will not clear the hashmap this will lead to client confusion.
		
		//3.Unmodifiyable hashmap and list --> this is actual solution
		//but if its not collection then we should return the new object instead of the actual one.
		
		Customer cust = (Customer) customerRecords.getCustByName("Wesly");
		cust.getId();
		cust.setId(5);
//		/customerRecords.displayRecords();

		customerRecords.displayRecords();

		
		
		
		
		
		
	}

}
