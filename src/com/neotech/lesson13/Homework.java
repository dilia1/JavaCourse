package com.neotech.lesson13;

public class Homework {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Create a 2D array where you will store the following values: - Mr, Mrs,
		 * Ms, Miss -Smith, Jordan, Jackson, Obama.
		 * 
		 * After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 * 
		 * Be careful because they are mixed.
		 */
		
		String[][] names = {
				{ "Mr", "Mrs", "Ms", "Miss" },
				{ "Smith", "Jordan", "Jackson", "Obama" }
				};
		//Mrs Smith
		System.out.println(names[0][1] + " " + names[1][0]);
		//Mr Obama
		System.out.println(names[0][0] + " " + names[1][3]);
		//Ms Jackson
		System.out.println(names[0][2] + " " + names[1][2]);
		//Miss Jordan
		System.out.println(names[0][3] + " " + names[1][1]);
		
		
		System.out.println("----------------");
		
		
		/*
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then you program should print name of the
		 * students that has A and B grade
		 */
		
		String[][] name = { 
				{ "Alison", "Emma", "Emilia", "Eli" },
				{ "A", "C", "B", "A" }
				};
		System.out.println(name[0][0] + " has an " + name[1][0]);
		System.out.println(name[0][2] + " has a " + name[1][2]);
		System.out.println(name[0][3] + " has an " + name[1][3]);
		
		for (int i = 0; i < name[1].length; i++)
		{
			if (name[1][i].equals("A") || name[1][i].equals("B"))
			{
				System.out.println(name[0][i] + "'s grade is " + name[1][i]);
			}
		}
				
		
		
	}

}
