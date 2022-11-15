package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array or integer type and
		// store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.
		int sum2 = 0;
		int[][] numbers = {  {2, 9, 7},
							 {4, 12, 3},
							 {5, 7, 11}  };
		
		//for each loop
		for (int[] row : numbers)
		{
			for (int col : row)
			{
				sum2 += col;
			}
		}
		System.out.println("The total sum is " + sum2);
		
		//nested for loop
		int sum = 0;
		for (int row = 0; row < numbers.length; row++)
		{
			for (int col = 0; col < numbers[row].length; col++)
			{
				sum += numbers[row][col];
			}
		}
		System.out.println("The total sum is " + sum);
		
		
	}

}
