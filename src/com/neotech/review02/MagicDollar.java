package com.neotech.review02;

public class MagicDollar {

	public static void main(String[] args) {

		// Task until 2:10
		// $$$$$
		// $$$$$
		// $$$$$
		// $$$$$

//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("$");
//			}
//
//			System.out.println();
//		}

		// Task2 (make some changes on Task)
		// $$$$$
		// $   $
		// $   $
		// $$$$$

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}
}