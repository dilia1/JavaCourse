package com.neotech.lesson24;

public class Student {

	//create a class student that will have 3 subclasses as
	//neotech, college student, school student
	//define common behavior within parent class
	//and override some of the methods in the child classes
	//define some methods specific to the child classes
	//write an example of achieving run time polymorphism
	
	
	protected void study()
	{
		System.out.println("Student is studying");
	}
	
	public void doHomework()
	{
		System.out.println("Student is doing homework");
	}
}
	class NeotechStudent extends Student
	{
		@Override
		public void study()
		{
			System.out.println("Neotech student is coding");
		}
		
		public void getJob()
		{
			System.out.println("Neotech student becomes QA");
		}
	}
	
	class CollegeStudent extends Student
	{
		@Override
		public void study()
		{
			System.out.println("College student is studying for finals");
		}
	}
	
	class SchoolStudent extends Student
	{
		@Override
		public void study()
		{
			System.out.println("School students are in a school trip");
		}
	}
	
	

