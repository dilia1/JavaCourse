package com.neotech.lesson10;

public class NestedLoop {

	public static void main(String[] args) {
		// a loop within a loop
		
		//iterate through a number 5 times
		for (int i = 0; i < 5; i++)
		{
			//inner loop
			for (int j = 0; j < 5; j++)
			{
				System.out.println("i: " + i + " j: " + j);
			}//end of the inner loop
		}//end of the outer/main loop
		

	}

}
