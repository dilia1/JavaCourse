package com.neotech.lesson10;

public class PrintingHours {

	public static void main(String[] args) {
		// print the whole combination of hours and mins in a digital clock
		//00:00
		//00:01
		// ...
		// ...
		//23:59
		
		for (int hour = 0; hour < 24; hour++)
		{
			for (int minute = 0; minute < 60; minute++)
			{
				//1.we need to change the 0:0 to 00:00 (up to 10)
				if (hour < 10 && minute < 10)
				{
					System.out.println("0" + hour + ":" + "0" + minute);
				}
				//2.what if 10:1 ---> update it to 10:01
				else if (hour >= 10 && minute < 10)
				{
					System.out.println(hour + ":" + "0" + minute);
				}
				//3.what if 1:10 ---> update it to 10:10
				else if (hour < 10 && minute > 10)
				{
					System.out.println("0" + hour + ":" + minute);
				}
				//4.if both are larger than 9
				else
				{
					System.out.println(hour + ":" + minute);
				}
			}
		}

	}

}
