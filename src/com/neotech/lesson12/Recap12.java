package com.neotech.lesson12;

public class Recap12 {
	
	public static void main(String[] args) {
		
		//Let's create a basic integer array
		int[] grades = new int[5];
		//Let's print the size of this array
		System.out.println("The size of the array is: " + grades.length);
		//element with index #2
		System.out.println("The third element of the array is: " + grades[2]);
		
		grades[3] = 85;
		grades[1] = 90;
		// error: index 5 doesn't exist
		// grades[5] = 100;
		// error: can't assign a string
		// grades[2] = "hello"
		grades[2] = 100;
		grades[0] = 93;
		grades[4] = 78;
		
		// re-assign the value of an element
		grades[4] = 98;
		
		int size = grades.length;
		
		System.out.println("The size of the array after assigning values is " + size);
		// element with index # 2
		System.out.println("The third element of the array is: " + grades[2]);
		
		//lets find the total if all elements if the array
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		System.out.println("The total is: " + total);
		
		//2nd way: lets find the total using a for loop
		int sum = 0;
		for (int i = 0; i < 5; i++)
		{
			sum += grades[i]; //sum = sum + grades[i];
		}
		System.out.println("The total sum is: " + sum);
		
		//lets find an average of an array
		int average = total / 5;
		System.out.println("The average is " + average);
		
		//2nd way
		int avg = sum / grades.length; //int avg = sum / size;
		System.out.println("The average is " + average);
		
		
		String[] cities = {"Paris", "New York", "London", "Istanbul", "Tokyo", "Dushanbe"};
		System.out.println(cities[3]);
		
		System.out.println("The size of my string array is " + cities.length);
		//lets print the names of the cities on the screen
		for (int i = 0; i < cities.length; i++)
		{
			System.out.println(cities[i]); //cities.length = 6
		}
	}

}
