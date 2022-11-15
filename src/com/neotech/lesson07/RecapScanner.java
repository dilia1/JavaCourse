package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {

		// Class name = new Class name
		Scanner scanner = new Scanner(System.in); // naming the scanner

		// CTRL + Shift + O

		// Declaring strings
		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRaining;
		char gender;

		/*
		 * //be careful: System.out.println("Enter a sentence"); text1 = scanner.next();
		 * //read until you find space and give back what you read
		 * System.out.println(text1);
		 * 
		 * text2 = scanner.next(); System.out.println(text2); //next()- gives back until
		 * the next space
		 * 
		 * text3 = scanner.nextLine(); System.out.println(text3);
		 * 
		 * //what is the difference
		 * 
		 * 
		 * //group comment: "CTRL + Shift + /"
		 * 
		 * System.out.println("What is your age?"); age = scanner.nextInt();
		 * System.out.println("Age:" + age); System.out.println("What year is it?");
		 * year = scanner.nextInt(); System.out.println("Year" + year );
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Enter your name and year: "); age = scanner.nextInt();
		 * year = scanner.nextInt();
		 */

		
		/*
		 * System.out.println("Enter your salary:"); salary = scanner.nextDouble();
		 * System.out.println(salary);
		 */
		
		/*
		 * System.out.println("Is it raining?"); isRaining = scanner.nextBoolean();
		 * System.out.println(isRaining);
		 */
		
		/*
		 * System.out.println("Enter your gender (M or F): "); // gender =
		 * scanner.next().charAt(0); // method cha //in two steps //read the word with
		 * next() // String str = scanner.next(); //2. get the char you need at charAt()
		 * gender = str.charAt(1); System.out.println(gender);
		 */
		
		
		System.out.println("Enter your name, city, age, gender, and salary");
		//Sabah, Plattsburgh, 30, Male, 150000
		text1 = scanner.next();
		text2 = scanner.nextLine();
		age = scanner.nextInt();
		gender = scanner.next().charAt(0); //because in java indexing starts at 0. ex: Male, 0=M
		salary = scanner.nextDouble();
		System.out.println(text1 + " " + text2 + " " + age + " " + gender + " " + salary);
		
		
		
	}

}
