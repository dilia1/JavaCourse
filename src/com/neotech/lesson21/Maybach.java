package com.neotech.lesson21;

public class Maybach extends SportsCar{
	boolean expensive;
	
	public void lux()
	{
		System.out.println(make + " " + model + " is a very luxurious and expensive car.");
	}

	
	public static void main(String[] args) {
		Maybach mb1 = new Maybach();
		
		mb1.make = "Maybach";
		mb1.model = "AMG V12";
		mb1.expensive = true;
		mb1.fast = true;
		mb1.year = 2021;
		
		mb1.displayInfo();
		mb1.breaks();
		mb1.oilChange = true;
		
		
		
	}
}
