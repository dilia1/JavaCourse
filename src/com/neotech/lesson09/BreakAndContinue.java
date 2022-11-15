package com.neotech.lesson09;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++)
		{
			//when i becomes 5, break statement will execute 
			//and get out of the loop before executing 5
			if (i == 5)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		for (int a = 1; a <= 10; a++)
		{
			if (a == 5)
			{
				continue; //continue stops at this number and skips it while continuing the loop afterwards
			}
			System.out.println(a);
		}
		
		
		
		
	}

}
