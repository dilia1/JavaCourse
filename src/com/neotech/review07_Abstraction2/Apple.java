package com.neotech.review07_Abstraction2;

// you can only extend one class
// but you can implement multiple interfaces
public class Apple extends Fruit implements Peelable, Washable{
	
	public Apple(String color) {
		super(color);
	}
	
	@Override
	public void peel() {
		System.out.println("Peeling the apple.");
	}
	
	@Override
	public void wash() {
		System.out.println("Washing the apple.");
	}

}
