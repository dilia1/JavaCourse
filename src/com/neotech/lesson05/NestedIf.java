package com.neotech.lesson05;

public class NestedIf {
	
	public static void main(String[] args) {
		
		//if it is morning --> say good morning
			//if it is a school day - you are at school
			//else you are at home
		//else (not morning) ---> good afternoon
		
		
		boolean isMorning = true;
		boolean isSchoolDay = false;
		
		if (isMorning)
		{
			System.out.println("Good morning!");
			if(isSchoolDay)
			{
				System.out.println("You are at school!");
			}
			else
			{
				System.out.println("You are at home!");
			}
		}
		else
		{
			System.out.println("Good afternoon!");
		}
		
		
		
		
	}

}
