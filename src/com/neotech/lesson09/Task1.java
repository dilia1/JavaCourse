package com.neotech.lesson09;

public class Task1 {

	public static void main(String[] args) {
		
		// print number from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(i + " ");
		}
		

		System.out.println(); //for a line in between tasks
		//print numbers from 100 to 1
		for (int a = 100; a >=1; a--)
		{
			System.out.print(a + " ");
		}
		
		
		System.out.println();
		//print even numbers from 20 to 1
		for (int c = 20; c >= 1; c--)
		{
			if(c % 2 == 0)
			{
				System.out.print(c + " ");
			}
		}
		System.out.println();
		for (int c = 20; c >= 1; c -= 2)
		{
			System.out.print(c + " ");
		}
		
		
		
		
		System.out.println();
		//print odd numbers between 20 and 50
		for (int b = 20; b <=50; b++)
		{
			if (b % 2 == 1)
			{
				System.out.print(b + " ");
			}
		}
		System.out.println();
		for (int d = 21; d <= 50; d += 2)
		{
			System.out.print(d + " ");
		}
		System.out.println();
		
		
		
	}

}
