package com.neotech.review06;

// OOP --> Object oriented programming
// 1. Inheritance
// 2. Polymorphism
// 3. Abstraction
// 4. Encapsulation

public class Doctor {
	String name;
	int salary;
	String licenceId;
	
	Doctor()
	{
		
	}
	///it is a good practice to leave a default constructor 
	
	
	Doctor(String name, int salary, String licenceId)
	{
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;
		
	}
	
	public void checkUp(String patientName)
	{
		System.out.println("Doctor " + this.name + " makes a check up on " + patientName);
	}

}
