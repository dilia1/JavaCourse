package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		
		Phone iPhone = new Phone();
		
		iPhone.brand = "Apple";
		iPhone.color = "Red";
		iPhone.model = "14 Pro";
		iPhone.price = 2000;
		
		iPhone.call();
		iPhone.text();
		iPhone.navigate();
		
		
		Phone android = new Phone();
		
		android.brand = "Samsung";
		android.color = "Black";
		android.model = "Note 10";
		android.price = 500;
		android.call();
		android.text();
		android.navigate();
		
		Phone nokia = new Phone();
		
		nokia.brand = "Nokia";
		nokia.color = "Blue";
		nokia.model = "3310";
		nokia.price = 30;
		
		nokia.call();
		nokia.text();
		nokia.navigate();
		
		
		
		
		
	}

}
