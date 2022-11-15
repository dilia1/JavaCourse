package com.neotech.lesson21;

public class TownHome extends Homework21 {
	boolean hasBasement;
	
	public void features()
	{
		System.out.println("Does " + home + " have a basement? " + hasBasement);
	}
	
	public static void main(String[] args) {
		TownHome th = new TownHome();
		th.hasBasement = true;
		th.home = "Town Home";
		th.age = 20;
		th.rooms = 5;
		
		th.houseInfo();
		th.features();
		
		
	}

}
