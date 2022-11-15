package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns
		//and print all values of the whole array
		
		int[][] days = { {1,4,5,7,8},
				         {4,0,9,2,1},
				         {3,8,5,4,9} };

		for (int row = 0; row < days.length; row++)
		{
			for (int col = 0; col < days[row].length; col++)
			{
				System.out.print(days[row][col] + " ");
			}
			System.out.println();
		}
		
		
		
		int[][] numbers = { {1,4,5,7,8},
		         			{4,0,9,2,1},
		         			{3,8,5,4,9} };
		for (int building = 0; building < numbers.length; building++)
		{
			for (int unit = 0; unit < numbers[building].length; unit++)
			{
				System.out.print(numbers[building][unit] + " ");
			}
			System.out.println();
		}
		
	}

}
