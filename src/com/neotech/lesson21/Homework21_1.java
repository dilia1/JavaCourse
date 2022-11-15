package com.neotech.lesson21;

public class Homework21_1 {

	/*
	 * Write a Java program called Car. Specify features and behaviors of the Car
	 * class. Create SportsCar and FamilyCar subclasses of the Car class with their
	 * own features and behaviors. Next, create a LuxurySportsCar that will inherit
	 * the SportsCar and also will have its own features and behaviors. Create
	 * objects from each class and test them.
	 */
	
	String model, make;
	int year;
	boolean oilChange;
	
	public void drive()
	{
		System.out.println(make + " " + model + " takes me places.");
	}
	
	public void breaks()
	{
		System.out.println("If oil is not changed, the engine will break!");
	}
	
	public void displayInfo()
	{
		System.out.println("My car is a " + make + " " + model + " and it is a " + year + " model.");
	}
	
	
}
