package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		
		// ++ increment
		//  -- decrement
		
		int x;
				
		int y = 10;
		
		//Post Increment
		//1. perform x = y
		//2. increment (y = y +1)
		x = y++;
		
		System.out.println(x);
		System.out.println(y);
		
		//PRE Increment
		int a;
		int b = 15;
		
		//1. first increment b = b + 1
		//2. assign value of b to a
		a = ++b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		// Decrement --
		
		int c;
		int d = 14;
		
		//PRE Decrement
		//1. first decrement the value of d
		//2. assign it to c
		d = d - 1;
		c = d;    //or c = --d;
		//this means
		// d -= 1
		// c = d
		
		System.out.println(c);
		System.out.println(d);
		
		//POST Decrement
		
		int e;
		int f = 14;
		
		e = f--;
		//the same as:
		// e = f;
		// f = f - 1;
		
		System.out.println(e);
		System.out.println(f);
		
	}
	
}
