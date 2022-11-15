package com.neotech.lesson10;

public class Task {

	public static void main(String[] args) {
		
		//1
		//22
		//333
		//4444
		//55555
		
		for (int i = 1; i <= 5; i++)
		{
			for (int f = 0; f < i; f++)
			{
				//do this as many time as the value of i
				System.out.print(i);
			}
			//print a new line and go to the outer loop
			System.out.println();
		}
		
	}
}
