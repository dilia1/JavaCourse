package com.neotech.lesson16;

public class Homework {
	
	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType, your method should return complete email address. Example:
	 * firstName -> john lastName -> snow emailType -> gmail return ->
	 * johnsnow@gmail.com
	 */

	public static String createEmail(String firstName, String lastName, String emailType)
	{
		String result = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailType + ".com";
		
		System.out.println(result);
		
		return result;
	}
	
	
	public static void main(String[] args) 
	{	
		createEmail("Dilia", "Alimova", "gmail");	
	}
	
	
}
