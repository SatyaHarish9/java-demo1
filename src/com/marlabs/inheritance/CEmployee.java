package com.marlabs.inheritance;

public class CEmployee extends Employee {
	float perDaySalary;
	float numberOfDays;
	double takeHomeSalary;

	public CEmployee(int empNumber, String empName, String empJob, String empPassword, int empDeptNumber,
			float perDaySalary, float numberOfDays) {
		// super at constructor level
		super(empNumber, empName, empJob, empPassword, empDeptNumber);
		System.out.println("From CEmployee class");
		this.perDaySalary = perDaySalary;
		this.numberOfDays = numberOfDays;
	}

	@Override
	public void doSalaryCalculation() {
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays + 1500);
		} else {
			takeHomeSalary = Math.round(perDaySalary * numberOfDays);
		}

	}

	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement(); // super at method level
		System.out.println("Employee per day Salary:" + "\t" + perDaySalary);
		System.out.println("Days worked:" + "\t" + numberOfDays);
		System.out.println("Employee take home Salary:" + "\t" + takeHomeSalary);
		System.out.println("*******************************");
	}

}
