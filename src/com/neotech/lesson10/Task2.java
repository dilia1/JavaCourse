package com.neotech.lesson10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// get input from user, then based on that print the following structure
		//ex: 6
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int input = scan.nextInt();
		
		for (int row = 1; row <= input; row++)
		{
			for (int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		for (int row = input - 1; row > 0; row--)
		{
			for (int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
	}

}
