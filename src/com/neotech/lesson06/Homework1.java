package com.neotech.lesson06;

public class Homework1 {

	public static void main(String[] args) {
		// Write a Java program to check if a patient has allergies.
		// If the patient does not have allergies print "You're healthy!".
		// If the patient has allergies, check if it is a 
		// peanut allergy, lactose allergy,
		// seafood allergy or bee allergy
		// and print a statement telling the patient "Don't eat ___".
		// (fill the line with the food names - peanut, seafood, etc)
		
		boolean allergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;
		
		// Format the code
		// CTRL/Command + Shift + F
		// Run the code: CTRL/Command + F11
		
		if(allergy) {
			// the patient has allergies
			System.out.println("You have allergy!");
			
			if(peanut) {
				// the patient has peanut allergy
				System.out.println("Don't eat peanuts!!!");
			}
			if(lactose) {
				// the patient has lactose allergy
				System.out.println("Don't drink milk!!!");
			}
			if(bee) {
				// the patient has bee allergy
				System.out.println("Stay away from bees!!!");
			}
			if(seafood) {
				// the patient has seafood allergy
				System.out.println("Don't eat fish!!!");
			}	
		}
		else {
			// the person has no allergies
			System.out.println("You're healthy!");
		}
		
		
		
	}
}
