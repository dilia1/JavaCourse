package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {
	boolean teachesApChemistry;
	
	public void doesExperiment()
	{
		System.out.println(fullName + " does Chemistry experiments");
		System.out.println(fullName + " teches chemistry: " + teachesApChemistry); 
	}
	
	
	public static void main(String[] args) {
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.fullName = "Walter White"; // coming from base class
		ct.major = "Chemistry"; // coming from base class
		ct.teachesApChemistry = true; // coming from current class
		
		ct.teaches(); // coming from the base class
		ct.doesExperiment(); // coming from current class
	}

}
