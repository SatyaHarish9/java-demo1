package com.marlabs.inheritance;

import java.util.Scanner;

public class DynamicBindingExample {
	public static void main(String args[]) {
		System.out.println("I am from main method");
		Employee employee = null;
		System.out.println("Enter the type of employee");
		Scanner scanner = new Scanner(System.in);
		String empType = scanner.next();
		if ("PEmployee".equals(empType)) {
			employee = new PEmployee(2000, "AAA", "Tester", "Test@123", 10, 9000, 2530.25d);

		} else if ("CEmployee".equals(empType)) {
			employee = new CEmployee(3000, "BBB", "Developer", "Test@123", 20, 780.50f, 24.50f);
		} else {
			System.err.println("Enter correct type of employee");
			System.exit(0);
		}
		employee.doSalaryCalculation();
		employee.displaySalaryStatement();
		employee.setEmpPassword("AAA@123");
		scanner.close();
		System.out.println("End of main method");
	}

}
