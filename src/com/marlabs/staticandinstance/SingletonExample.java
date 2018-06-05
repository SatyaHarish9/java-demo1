package com.marlabs.staticandinstance;

public class SingletonExample {
	private static SingletonExample singletonObject;

	private SingletonExample() {
		// message
	}

	// Synchronized allows only one thread to access this method at a point of
	// time
	public synchronized static SingletonExample getInstance() {

		if (singletonObject == null) {
			System.out.println("I am from if condition");
			singletonObject = new SingletonExample();
		}
		return singletonObject;
	}

	public void loadUserDetails() {
		// JDBC
		System.out.println("User Name:" + "Admin" + "\t" + "Password:" + "Admin@123");
		System.out.println("User Name:" + "Admin1" + "\t" + "Password:" + "Admin@12");
		System.out.println("User Name:" + "Admin2" + "\t" + "Password:" + "Admin");

	}

}
