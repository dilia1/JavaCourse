package com.neotech.lesson14;

public class Dog {

//Create a class Dog
//    features: breed, size, color and age
//    behaviors: eat(), run(), bark()

	String breed, size, color;
	int age;

	void eat() {
		System.out.println(breed + " eats!");
		System.out.println(breed + " eats again!");
	}

	void run() {
		System.out.println(breed + " runs!");
	}

	void bark() {
		System.out.println(breed + " barks loud!");
	}

}