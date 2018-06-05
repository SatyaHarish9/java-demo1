package com.marlabs.inheritance;

public abstract class Employee {

	int empNumber;
	String empName;
	String empJob;
	private String empPassword;
	int empDeptNumber;

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Employee(int empNumber, String empName, String empJob, String empPassword, int empDeptNumber) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.empJob = empJob;
		this.empPassword = empPassword;
		this.empDeptNumber = empDeptNumber;
	}

	public abstract void doSalaryCalculation() {
		
	}

	public void displaySalaryStatement() {
		System.out.println("***************************");
		System.out.println("Employee number:" + "\t" + empNumber);
		System.out.println("Employee name:" + "\t" + empName);
		System.out.println("Employee Dept Number:" + "\t" + empDeptNumber);
		System.out.println("Employee Job:" + "\t" + empJob);

	}

}
