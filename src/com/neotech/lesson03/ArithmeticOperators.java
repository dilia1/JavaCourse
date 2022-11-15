package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//type name = value   ;
		// type + name; ---> declaration
		int num1, num2;
		
		//initialization
		num1 = 27;
		num2 = 5;
		
		
		//data type - name - = - value (calculation) ;
		int sum = num1 + num2; //addition
		int div = num1 / num2; //division
		int mult = num1 * num2; //multiplication
		int sub = num1 - num2; //subtraction
		
		System.out.println("Sum: " + sum);
		System.out.println("Div: " + div);
		System.out.println("Mult: " + mult);
		System.out.println("Sub: " + sub);
		
		
		
		double d1, d2;
		
		d1 = 27;
		d2 = 5;
		
		double div_doubles = d1/d2;
		System.out.println(div_doubles);
		
		double div_int = num1/num2; //the result of two integers, is int
		System.out.println(div_int);
		
	}

}