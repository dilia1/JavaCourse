package com.neotech.review07_Abstraction2;

//in Java we don't allow multiple inheritances
//in Java we achieve multiple inheritances through interface
// :(
public class Coconut extends Fruit implements Crackable{
	public Coconut(String color) {
		super(color);
	}

	
	public void crack() {
		System.out.println("Cracking the Coconut.");
	}
}
