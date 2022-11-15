package com.neotech.lesson11;

public class ArrayLenght {

	public static void main(String[] args) {
		
		//arrays: collection of the same type data
		String[] students = new String[5];
		//default value for String is null
		
		students[0] = "Mary";
		students[1] = "Kate";
		students[2] = "Brian";
		students[3] = "Larry";
		//students[4] = "Ben";
		
		//how can we get the length of an array?
		int arrayLength = students.length;
		System.out.println("The lenght of the students array is: " + arrayLength);
		
		//Another way how to declare an array
		int[] scores = {90, 86, 94, 88, 80};
		
		System.out.println("The length of scores array is: " + scores.length);
		
		
		
		

	}

}
