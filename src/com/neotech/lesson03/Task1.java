package com.neotech.lesson03;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name the Variables 
		 * In your program create different type of variables to store 
		 * student’s information and then print value of
		 * those variables: ▪ name ▪ lastName ▪ grade ▪ city ▪ state
		 */
		
		String name = "Dardan";
		String lastName = "Meshi";
		char grade = 'A';
		String city = "NYC";
		String state = "NY";

		System.out.println(name + " " + lastName + " " + grade 
				+ " " + city + " " + state +"\n");
		
		//lets print them seperately
		System.out.print(name + " ");
		System.out.print(lastName+ " ");
		System.out.print(grade + " ");
		System.out.print(city + " ");
		System.out.println(state);
		
		
	}

}