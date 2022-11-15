package com.neotech.lesson12;

public class TwiDimensionalArrayLength {
	
	public static void main(String[] args) {
		
		String[][] months = {
				{"December", "January", "February"}, //row 0
				{"March", "April", "May"}, // row 1
				{"June", "July", "August"}, // row 2
				{"September", "October", "November"} //row 3
			};
		//System.out.println(months.length); //it gives you the number of the rows
		int rowCount = months.length;
		System.out.println("There are a total of " + rowCount + " rows");
		
		int lengthOfRowIndex1 = months[1].length;
		System.out.println("Row index 1 has " + lengthOfRowIndex1 + " columns");
		
	}

}
