package com.anand.memory.gc;

public class GarbageCollectionMain {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long availableBytes = runtime.freeMemory() / (1024 * 1024);
		System.out.println("Available Memory space:" + availableBytes + " MB");

		for (int i = 0; i <= 100; i++) {
			Customer cust = new Customer();

		}
		availableBytes = runtime.freeMemory() / (1024 * 1024);
		System.out.println("Available Memory space:" + availableBytes + " MB");
		System.gc();
		availableBytes = runtime.freeMemory() / (1024 * 1024);
		System.out.println("Available Memory space:" + availableBytes + " MB");

	}

}
