package com.marlabs.inheritance;

public class PEmployee extends Employee {
	double empBasic;
	double empCommission;
	double takeHomeSalary;

	public PEmployee(int empNumber, String empName, String empJob, String empPassword, int empDeptNumber,
			double empBasic, double empCommission) {
		// super at constructor level
		super(empNumber, empName, empJob, empPassword, empDeptNumber);
		this.empBasic = empBasic; // this at variable level
		this.empCommission = empCommission;
	}

	@Override
	public void doSalaryCalculation() {
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.40 + empBasic * 0.40 + empCommission);
		} else if (empDeptNumber == 20) {
			takeHomeSalary = Math.round(empBasic + empBasic * 0.30 + empBasic * 0.30 + empCommission);
		} else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}

	}

	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement(); // super at method level
		System.out.println("Employee Basic Salary:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empCommission);
		System.out.println("Employee take home Salary:" + "\t" + takeHomeSalary);
		System.out.println("*******************************");
	}

}
