package com.neotech.lesson16;

public class Student {
	//Create a class Student that will have a method getGrade.
//	Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F
	
	public static char getGrade(int score)
	{
		char result = 'A';
		if (score >= 90 && score <= 100)
		{
			result = 'A';
		}
		else if (score >= 80 && score < 90)
		{
			result = 'B';
		}
		else if (score >= 70 && score < 80)
		{
			result = 'C';
		}
		else if (score >= 50 && score < 70)
		{
			result = 'D';
		}
		else
		{
			result = 'F';
		}
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		
		getGrade(85);
		
	}
	
	
	
	
	

}
