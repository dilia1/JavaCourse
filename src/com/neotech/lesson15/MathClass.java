package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Addition");
		cal.add(5,  7);
		cal.add(10, 15);
		cal.add(300, 125);
		
		System.out.println("Multiply");
		cal.multily(5, 7);
		cal.multily(6, 2);
		
		System.out.println("Division");
		cal.divide(8, 3);
		cal.divide(55.1, 13.5);
	//	cal.divide(3.5, 0); the most common issue when dividing, is division by 0
		
		
		
		


	}

}
