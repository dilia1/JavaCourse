package com.neotech.lesson14;

public class Homework {

	public static void main(String[] args) {
		/*  Create an array of countries: north America countries, south America countries, 
			European countries, Asian countries, African countries. Then print 
			all values from that array using 2 different loops and calculate how 
			many total countries been stored.   */
		
		
		String[][] countries = {  {"USA", "Greenland", "Cuba", "Canada"},
								  {"Brazil", "Colombia", "Argentina", "Peru"},
								  {"Italy", "France", "Denmark", "Austria"},
								  {"China", "Uzbekistan", "Japan", "India"}  };
		int sum = 0;
		//for each loop
		for (String[] row : countries)
		{
			for (String col : row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		//nested for loop
		for(int i = 0; i < countries.length; i++) 
		{
			for(int j = 0; j < countries[i].length; j++) 
			{
				System.out.print(countries[i][j] + " ");
			}
			System.out.println();
		}
		
		//sum of countries
		for (int i = 0; i < countries.length; i++)
		{
			sum = sum + countries[i].length;
		}
		System.out.println("The total sum of countries is " + sum);
		
		
		
		System.out.println("+++++++++++++++++++++++");
		
		
		//Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		int secondLargest, min, max;
		
		int[][] numbers = {  {3,4,67,8},
					 		 {21,3,9,12},
					 		 {32,5,15,80},
					 		 {29,35,2,1}    };
		max = numbers[0][0];
		min = numbers[0][0];
		secondLargest = numbers[0][0];
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers[i].length; j++)
			{
				if (max < numbers[i][j])
				{
					max = numbers[i][j];
				}
				else if (min > numbers[i][j])
				{
					min = numbers[i][j];
				}
			}
		}
		
		
		for (int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++) 
			{
				if(secondLargest < numbers[i][j] && numbers[i][j]!=max) 
				{
					secondLargest = numbers[i][j];
				}
			}
		}
		System.out.println("Max number is " + max);
		System.out.println("Min number is " + min);
		System.out.println("Second largest number is " + secondLargest);
		
		
	}

}
