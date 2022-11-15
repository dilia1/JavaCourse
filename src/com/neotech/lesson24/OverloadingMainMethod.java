package com.neotech.lesson24;

public class OverloadingMainMethod {
	
	// can we overload main method? Yes
	public static void main(int[] args) {
		System.out.println("Main method with string array parameter");
	}
	
	
	private static void main(String arg1, String arg2) {
		System.out.println("Main method with two string parameters");
	}
	
	public static void main(int arg1, int arg2) {
		System.out.println("Main method with two integer parameters");
	}
	
	public static void main(String[] jenn) {
		// java looks for a main method with this signature
		System.out.println("Main method with string array method");
		OverloadingMainMethod.main(3, 5);
		
		// do I need the class name to call the methods? No
		main("Hi", "Bye");
		
		int[] intArray = { 1, 2, 3, 4 };
		main(intArray);
		
	}
	

}
