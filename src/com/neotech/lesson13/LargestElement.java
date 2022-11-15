package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {
		// Find the largest number is an array
		
		int[] numbers = { 45, 34, 87, 33, 15, 92, 13, 55 };
		
		//1st way
		//int largest = -99999;
		
		int largest = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
		{
			//compare the current largest number with the new number the loop gives
			if (largest < numbers[i])
			{
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is " + largest);
		
		

	}

}
