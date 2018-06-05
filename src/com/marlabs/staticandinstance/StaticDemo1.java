package com.marlabs.staticandinstance;

import java.util.Date;

public class StaticDemo1 {
	static {
		System.out.println("I am Static block-2");
	}

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

	{
		System.out.println("I am from instance block-2");
	}

	StaticDemo1() {
		System.out.println("I am from static demo1 constructor");
	}

	public static void main(String args[]) {
		System.out.println("I am from main method");
		f3(); // Rule -2
		// f2();
		StaticDemo1 demo = new StaticDemo1();
		demo.f2(); // Rule - 3
		System.out.println("End of main method");
	}

	{
		System.out.println("I am from instance block-1");
	}

	static {
		System.out.println("I am from static block");
		Date date = new Date();
		System.out.println(date);
	}

}
