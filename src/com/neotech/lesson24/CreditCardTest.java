package com.neotech.lesson24;

public class CreditCardTest {
	
	public static void main(String[] args) {
		
		CreditCard card1 = new CreditCard(4000);
		card1.calculateInterest();
		
		// up-casting is done automatically
		CreditCard card2 = new AX(8000);
		card2.calculateInterest();
		
		CreditCard card3 = new Visa(12000);
		card3.calculateInterest();
	//	card3.cashBack(); //CE, type of card3 is Parent class, in Parent class there is no cash back
		
		System.out.println("----------------------");
		// How do I call cashBack?
		// I have to do down-casting: down-casting is done manually
		Visa visaCard = (Visa)card3;
		visaCard.calculateInterest();
		visaCard.cashBack();
		
	}

}
