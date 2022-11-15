package com.neotech.lesson09;

public class Homework1 {

	public static void main(String[] args) {
		// 1. Write a program using while loop
		// that calculates the sum of the even numbers between 0 and 10.
		
		// this is the silly way
		//   System.out.println(2 + 4 + 6 + 8 + 10);
		
		//create a logic that whatever number I give you is, you will print all next
		//even numbers until 5000
		
		//1,2,3,4,5,6,7,8,9,10
		
		//how do i write a While going from 1 to 10
		int i = 0;
		int sum = 0;
		
		while(i <= 10)
		{
			//now check the current number is odd or even
			if (i % 2 == 0);
			{
				//we want to add all of the even numbers
				//we use the sum to add all the even numbers there, and when we are done,
				//sum will hold the total sum
				sum += i;
	
			}
			
			
			i+=2;
		}
		System.out.println("The total sum is: " + sum);

		
		//2nd way  - increment by 2
		//0, 2, 4, 6, 8, 10
		int j = 0;
		int total = 0;
		while(j <= 10)
		{
			total += j;
			
			j += 2;
		}
		
		System.out.println("The total is: " + total);
		

	}

}
