package com.neotech.lesson16;

import java.util.Scanner;

public class StringMoreMethods {

	public static void main(String[] args) {
		

		//charAt()
		
	//	Scanner scan = new Scanner(System.in);
	//	char letter = scan.next().charAt(0);
	//	System.out.println(letter);
		
		
		
		String name = "Mehpare";
		char letter = name.charAt(3);
		System.out.println("letter: " + letter);
		
		
		
		//indexOf()
		int index = name.indexOf('e');
		System.out.println("Index of e is: " + index);
		
		String name1 = "Burak";
		System.out.println("Index of u is ---> " + name1.indexOf('u'));
		System.out.println("Index of ak is -->" + name1.indexOf("ak"));
		
		
		//subString()
		String message = "Today is a very good day!";
		String substr = message.substring(9); //only one parameter, beginIndex
		System.out.println(substr);
		
		String substr2 = message.substring(6, 8);
		System.out.println(substr2);

	}

}
