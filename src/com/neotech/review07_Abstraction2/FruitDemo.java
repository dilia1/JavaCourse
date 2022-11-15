package com.neotech.review07_Abstraction2;

public class FruitDemo {
	
	public static void main(String[] args) {
		
		Apple a = new Apple("Yellow");
		a.peel();
		a.wash();
		
		Coconut c = new Coconut("Brown");
		c.crack();
		
		Fruit f = new Apple("Red"); //up-casting
	//	f.peel();
	//	f.wash();
		
		Apple a2 = (Apple) f; //down-casting
		a2.peel();
		a2.wash();
		
		// this is not possible, we cannot create an object
	//	Peelable p = new Peelable(); 
		Peelable p2 = new Apple("Green"); //up-casting
		p2.peel();
		
	}

}
