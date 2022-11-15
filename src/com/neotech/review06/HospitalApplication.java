package com.neotech.review06;

public class HospitalApplication {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Karen", 170000, "D123");
		d1.checkUp("Emine");
		
		Dermatologist d2 = new Dermatologist("Alex", 500000, "D555");
		//2nd way
		//d2.name = "Alex";
		//d2.salary = 500000;
		//d2.licenceId = "D555";
		d2.dermId = "X987";
		d2.checkUp("Dardan");
		d2.applySkinTreatment();
		
		System.out.println("_-----------------");
		
		Dermatologist d3 = new Dermatologist("Kenan", 190000, "D482");
		d3.dermId = "X284";
		d3.salary = 210000; // we are reassigning the salary
		d3.applySkinTreatment();
		
		System.out.println("---------------");
		
		//creating a Dermatologist with 4 parameter
		Dermatologist d4 = new Dermatologist("Jennifer", 350000, "D195", "X951");
		d4.checkUp("Emine");
		d4.applySkinTreatment();
		
		
		
	}
}
