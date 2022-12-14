package com.neotech.lesson16;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//11st way we used to create strings
		
		String name = "Oktay"; //string literal
		
		
		//2nd way to create strings
		String name2 = new String("Dardan");
		
		//length()
		int size = name.length();
		System.out.println("The size of he name is " + size);
		
		String school = "Neotech";
		System.out.println("The size of the school name is " + school.length());
		
		String school2 = "   Neotech   ";
		System.out.println("The length of school name is " + school2.length());
		
		
		
		//toUpperCase()  toLowerCase()
		String city = "New York";
		
		String lowercaseCity = city.toLowerCase();
		System.out.println(lowercaseCity);
		
		System.out.println(city.toUpperCase());
		
		
		System.out.println(city); //what is the value of city? (New York)
		//String objects are immutable!!! It does not change
		
		
		//concat()
		String sentence = " The size of " + school + " is " + school.length();
		
		String name1 = "Baris";
		String lastName = "Yasar";
		
		String fullName = name1 + lastName;
		
		String fullName2 = name1.concat(lastName);
		System.out.println("Full name is " + fullName2);
		
		
		String nameWithSpace = name1 + " " + lastName;
		String nameWithSpace1 = name1.concat(" ").concat(lastName); //method chaining
		System.out.println(nameWithSpace1);
		
		
		
		//isEmpty(0
		String str = " ";
		boolean isEmp = str.isEmpty();
		System.out.println(isEmp);
		
		//trim()
		String str2 = " I am    very hungry      !    ";
		System.out.println(str2.trim());
		
		
		System.out.println("Length of str2 is " + str2.length());
		System.out.println("length of trimmed str2 is " + str2.trim().length());
		
		System.out.println("-------------------------");
		
		int[] num = {4,3, 6, 7};
		int sizeArray = num.length;
		
		int sizeOfString = "Hello".length(); //this is a string method
		
		
		
		
	}

}
