package com.neotech.lesson04;

public class Homework {

	public static void main(String[] args) {
		// 2. Write a java program that converts mile to km and km to miles.
		// Use scale 1 mile = 1.609344.

		double mile, km, scale; // declaring 3 variables

		scale = 1.609344;
		mile = 2;

		km = mile * scale;

		System.out.println(mile + " miles is " + km + " kilometers");

		System.out.println("--------------------------------");

		double km2 = 60;
		double mile2 = km2 / scale;

		System.out.println(km2 + " kilometers is " + mile2 + " miles");

	}

}