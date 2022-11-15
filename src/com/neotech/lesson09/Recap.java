package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		
		// How can we print Good Evening 5 times
		
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		System.out.println("Good Evening");
		
		
		
		//2nd
		//what do we need when we use a While loop?
		// - we are responsible for where, when we start
		// - we are responsible for when we stop
		
		
		int count = 1;
		while (count < 6)
		{
			System.out.println("Good Evening");
			count++; //count = count + 1; or count +=1;
		}
		
		//3rd - using do while
		int num = 1;
		do
		{
			
			System.out.println("Good Evening");
			
			num++;
			
		}while(num <= 5);
		
		
		int n1 = 10;
		while (n1 <= 5)
		{
			System.out.println("Good night");
			n1++;
		}
		
		
		
		int n2 = 10;
		do
		{
			System.out.println("good night");
			n2++;
		}while (n2 <= 5); // do while prints one time even if it is false
		

	}

}
