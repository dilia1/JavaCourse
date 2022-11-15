package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.size = "Big";
		a.color = "Brown";
		a.age = 5;
		
		a.sleep();
		a.eat();
		a.displayInfo();
		
		System.out.println("----------------");
		Dog d = new Dog();
		d.size = "Medium"; // coming from Animal
		d.color = "White"; // coming from Animal
		d.age = 2; // coming from Animal
		d.breed = "Husky";  // specific to Dog object
		
		d.eat(); // coming from Animal
		d.sleep(); // coming from Animal
		d.displayInfo(); // coming from Animal
		d.bark(); // specific to Dog object
		
		System.out.println("-----------------");
		Cat c = new Cat();
		c.size = "Small";
		c.color = "Gray";
		c.age = 1;
		c.weight = 15;
		
		c.eat(); // coming from Animal
		c.sleep(); // coming from Animal
		c.displayInfo(); // coming from Animal
		c.meow(); // specific to Cat object
		
		System.out.println("-----------------");
		Puppy p = new Puppy();
		p.size = "Tiny"; // coming from Animal
		p.breed = "Jack Russel;";
		p.age = 1; // coming from Dog
		p.hasPottyTraining = false; // this belong to Puppy
	}

}
