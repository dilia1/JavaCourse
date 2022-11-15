package com.neotech.lesson22;

public class A {
	/*
	 * Write a program for multilevel inheritance where class A is inherited by B and
	 * class B is inherited by class by C.
	 */

	
	
	//this.  --> it accesses elements within the class
	//super. --> it accesses elements on the parent class
	String name = "A";
	
	
	void method()
	{
		System.out.println("This a method in class A!");
		System.out.println(this.name);
	}
	
}

class B extends A
{
	String name = "B";
	
	void method()
	{
		System.out.println("This is a method in class B!");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
}

class C extends B
{
	String name = "C";
	
	void method(String name)
	{
		System.out.println("This is a method in class C!");
		System.out.println(this.name); //java compiler converts it to this.name
		System.out.println(super.name);
		super.method();
	}
}