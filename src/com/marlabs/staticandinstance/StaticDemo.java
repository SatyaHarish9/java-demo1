package com.marlabs.staticandinstance;

import java.util.Date;

public class StaticDemo {
	public void f1() {
		System.out.println("I am from f1 method");

	}

	public void f2() {
		System.out.println("I am from f2 method");
		f1(); // Rule -1
		f3();
		double b = Math.round(10.2345d);
	}

	public static void f3() {
		System.out.println(" I am from static f3 method");
	}

	public static void main(String args[]) {
		System.out.println("I am from main method");
		f3(); // Rule -2
		// f2();
		StaticDemo demo = new StaticDemo();
		demo.f2(); // Rule - 3
		System.out.println("End of main method");
	}

	static {
		System.out.println("I am from static block");
		Date date = new Date();
		System.out.println(date);
	}

}
