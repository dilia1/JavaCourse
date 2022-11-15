package com.neotech.lesson20;

public class StudentWithSabah {

	String name;
	int grade1, grade2, grade3;
	
	
	//if I want to allow user to create an object using the default constructor
	//I will create a non-argument constructor
	StudentWithSabah()
	{
		
	}
	
	StudentWithSabah(String studentName, int g1, int g2, int g3)
	{
		name = studentName;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
	}
	
	int average()
	{
		return (grade1 + grade2 + grade3)/3;
	}
	
	
	public static void main(String[] args) {
		
		StudentWithSabah s1 = new StudentWithSabah("Jama", 67, 89, 75);
		
		StudentWithSabah s2 = new StudentWithSabah("Elmira", 87, 89, 97);
		
		StudentWithSabah s3 = new StudentWithSabah("Kemal", 50, 29, 93);
		
		StudentWithSabah s4 = new StudentWithSabah("Said", 63, 75, 89);
		
		StudentWithSabah s5 = new StudentWithSabah("Hakan", 43, 78, 80);
		
		System.out.println(s1.name + " has an average of " + s1.average());
		System.out.println(s2.name + " has an average of " + s2.average());
		System.out.println(s3.name + " has an average of " + s3.average());
		System.out.println(s4.name + " has an average of " + s4.average());
		System.out.println(s5.name + " has an average of " + s5.average());
		
		
		//can I create this object
		StudentWithSabah s6 = new StudentWithSabah(); //does not work if you have defined a parameterized 
	}
}
