package com.marlabs.staticandinstance;

public class SingletonDemo {

	public static void main(String args[]) {
		System.out.println("I am from Main method");

		SingletonExample singletonInstance = SingletonExample.getInstance();
		System.out.println(singletonInstance);
		singletonInstance.loadUserDetails();

		SingletonExample singletonInstance2 = SingletonExample.getInstance();
		System.out.println(singletonInstance2);
		singletonInstance2.loadUserDetails();

		/*
		 * SingletonExample singletonInstance3 = new SingletonExample();
		 * System.out.println(singletonInstance3);
		 * singletonInstance3.loadUserDetails();
		 */

		System.out.println(" End of Main method");
	}

}
