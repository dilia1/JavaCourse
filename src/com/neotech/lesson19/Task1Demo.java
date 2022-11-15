package com.neotech.lesson19;

public class Task1Demo {

	public static void main(String[] args) {
		//can we access it by class name? NO
		
		Task1 obj = new Task1();
		
		int[] arr = {43,54,76,37,66};
		
		int sum = obj.sum(arr);
		
		System.out.println("The total sum of the array is: " + sum);
		
	}

}