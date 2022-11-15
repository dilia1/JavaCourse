package com.neotech.lesson13;

public class RetrievingValuesUsingForEach {

	public static void main(String[] args) {
		
		String[][] animals = {  {"cat", "dog", "bird"},
								{"tiger", "salmon", "bear"},
								{"lion", "seabass", "shrimp"}
																};
		//how to get the number of rows
		int rows = animals.length;
		
		//how to get the number of columns for the first row
		int first_row_cols = animals[0].length;
		int second_row_cols = animals[1].length;
		int third_row_cols = animals[1].length;
		
		//how do we get a specific value, e.g. lion
		String lion = animals[1][1];
		
		//how do we print all values?
		//nested for loop
		for (int row = 0; row < animals.length; row++) //goes through all rows
		{
			for (int col = 0; col < animals[row].length; col++)
			{
				System.out.print(animals[row][col] + " ");
			}
			System.out.println();
		}
		
		//using a for each loop
		System.out.println("USING A FOR EACH LOOP");
		
		for (String[] row : animals) //for each string array row of animals
		{
			for (String animal : row) //for each String in the surrent row
			{
				System.out.print(animal + " ");
			}
			System.out.println();
		}
		//using for each in 2D
		//first for loop            (1D array : 2D array)
		//second (nested) for loop  (String value : 1D array)
		
		
		int[][] grades = {  {95, 78, 85},
							{100, 68, 89, 90},
							{75, 78},
							{55, 89, 76, 80, 50}  };
		//2d array {   {value1}, {value2},    {}   }
		for (int[] row : grades)
		{
			for (int grade : row)
			{
				System.out.print(grade + " ");
			}
			System.out.println();
		}
		

	}

}
