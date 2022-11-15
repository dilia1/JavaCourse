package com.neotech.lesson15;

public class Phone {

	//Create a class "Phone". create 3 objects of it:
	//iPhone, Android, Nokia with specific attributes and behaviors
	
		//attributes
		String brand;
		String color;
		String model;
		int price;
		
		//behaviors
		
		void call()
		{
			System.out.println(brand + " is calling!");
		}
		void text()
		{
			System.out.println(brand + " is texting!");
		}
	
		void navigate()
		{
			System.out.println(brand + " is navigating!");
		}
	
		
	
	public static void main(String[] args) {
		
		//famous formula
		
		//data type name    =    value;
		Phone iPhone = new Phone();
		
		
		
	}
	
}
