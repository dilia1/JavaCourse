package com.neotech.review06;

public class Person {

	// instance variables
	public String name;
	int age;
	protected int weight;

	public Person() {

	}
	
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}

}