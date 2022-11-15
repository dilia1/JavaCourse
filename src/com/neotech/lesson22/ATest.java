package com.neotech.lesson22;

public class ATest {

	public static void main(String[] args) {
		
		//can I create an object of A
		A a = new A();
		a.method();
		System.out.println(a.name);
		
		
		C c = new C();
		c.method();
		System.out.println(c.name);
		
		
	}

}