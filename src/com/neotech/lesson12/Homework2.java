package com.neotech.lesson12;

public class Homework2 {

	public static void main(String[] args) {
		
		//Create an array on integers and calculate 
		//the sum of all elements in an array.
		int sum = 0;
		int[] degrees = {90, 85, 77, 93};
		for (int i = 0; i < degrees.length; i++)
		{
			sum += degrees[i];
		}
		System.out.println();
		System.out.println("The sum of the degrees is: " + sum);
	}
	
}
