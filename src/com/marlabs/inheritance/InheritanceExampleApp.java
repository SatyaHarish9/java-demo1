package com.marlabs.inheritance;

public class InheritanceExampleApp {
	public static void main(String args[]) {
		System.out.println("I am from main method");
		PEmployee pEmployee = new PEmployee(2000, "AAA", "Tester", "Test@123", 10, 9000, 2530.25d);
		pEmployee.doSalaryCalculation();
		pEmployee.displaySalaryStatement();
		pEmployee.setEmpPassword("AAA@123");
		System.out.println(pEmployee.getEmpPassword());

		System.out.println("End of Main method");
	}

}
