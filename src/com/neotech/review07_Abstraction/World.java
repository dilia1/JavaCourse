package com.neotech.review07_Abstraction;

public class World {

	public static void main(String[] args) {
		// I cannot create an object from Human class because it is 
		//an abstract class
	//	Human h1 = new Human("Melih");
		
		// up-casting  and down-casting can only be done because of inheritance
		Human a1 = new Albanian("Valbona"); // up-casting(creating an object and storing it as a parent class)
		a1.talk();
		a1.sleep();
	//	a1.albanianDance();
		
		Albanian alb = (Albanian) a1; //down-casting
		alb.albanianDance(); 

		Human t1 = new Turkish("Vane");
		t1.talk();
		t1.sleep();
	//	t1.makeBaklava();
		
		Turkish tur = (Turkish) t1; //down-casting , has to be done manually
		tur.makeBaklava();
	}

}
