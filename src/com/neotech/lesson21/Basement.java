package com.neotech.lesson21;

public class Basement extends TownHome {
	boolean gameRoom;
	public void relaxation()
	{
		System.out.println("Does the basement have a game room? " + gameRoom);
	}
	

	public static void main(String[] args) {
		
		Basement bm = new Basement();
		bm.gameRoom = true;
		bm.rooms = 2.5;
		bm.age = 20;
		bm.home = "Town Home";
		
		bm.features();
		bm.relaxation();
		

	}

}
