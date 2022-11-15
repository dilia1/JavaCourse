package com.neotech.lesson24;

public class StudentTest extends Student{

	public static void main(String[] args) {
		System.out.println("----- Student Object; Student");
		Student student = new Student();
		student.study();
		student.doHomework();
		// student.getJob(); cannot do because doHomewok() belongs to NeotechStudent
		
		System.out.println("----- NeoTech Student Object; NeotechStudent");
		NeotechStudent neotech = new NeotechStudent();
		neotech.study();
		neotech.doHomework();
		neotech.getJob();
		
		System.out.println("----- NeoTech Student Object; NeotechStudent");
		Student st1 = new Student(); // declaring a variable of type Student
		st1 = new NeotechStudent(); // assigning an object of the child class
		
		Student st2 = new CollegeStudent(); /// up-casting
		st1.study(); // run time polymorphism
		st2.study(); // acts like CollegeStudent
		
		
		
		
		
	}

}
