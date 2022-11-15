package com.neotech.lesson05;

public class Task2 {
	
	/*
	 * Create a Java program to check if it is a Friday or not.
	 * if it is a Friday, print "It's Friday. I am going to watch a movie."
	 * and check the date, if date is 13, print "I will watch a scary movie."
	 * If date is not 13, print "I will watch a comedy." If it is not Friday, print
	 * "It is not Friday. I am going to study JAVA."
	 */

	public static void main(String[] args) {
		
		boolean isFriday = false;
		int date = 14; //can be any number for the date
		
		//what is we have an extra condition:
		//if it is 15, then I will watch a thriller
				
		//a nested if else (if... else if...else) 
		if (isFriday)
		{
			System.out.println("It's Friday. I am going to watch a movie.");
			if (date == 13)
			{
				System.out.println("I will watch a scary movie.");
			}
			else 
			{
				System.out.println("I will watch a comedy");
			}
				
		}
		else
		{
			System.out.println("It is NOT Friday. I am going to study JAVA.");
		}
		
		
		//what is we have an extra condition:
		//if it is 15, then I will watch a thriller
		
		//a nested if else (if... else if...else)
		if (isFriday)
		{
			System.out.println("Its Friday so I will watch a movie!");
			
			//is date 13
			//is date 15
			//none of those
			if(date == 13)
			{
				System.out.println("I will watch a scary movie!");
			}
			else if (date == 15)
			{
				System.out.println("I will watch a thriller movie!");
			}
			else
			{
				System.out.println("I will watch a comedy!");
			}
	
		}
		else
		{
			System.out.println("Its not Friday so I will study Java!");
		}
		
		
	}
	
}
