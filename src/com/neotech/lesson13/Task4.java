package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
		//  create an array of cars ; american german korean italian
		//then retrieve all values from that array using 2 different loops
		
		String[][] cars = {  {"Ford", "Tesla", "Chevy"},
							 {"MB", "BMW", "Audi"},
							 {"Kia", "Hyundai"},
							 {"Fiat", "Lambo", "Ferrari"}  };
		
		for (int row = 0; row < cars.length; row++)
		{
			for (int col = 0; col < cars[row].length; col++)
			{
				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}
		
		for (String[] row : cars)
		{
			for (String col: row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println("_________________");
		
		//what if I want to print the American cars only
		for (int us = 0; us < cars[0].length; us++)
		{
			System.out.print(cars[0][us] + " "); //to print german cars use index 2
		}
	}

}
