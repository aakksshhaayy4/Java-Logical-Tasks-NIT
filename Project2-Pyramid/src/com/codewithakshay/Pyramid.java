package com.codewithakshay;

public class Pyramid {

	/*
	 * Pyramid program
	 * forward and backward
	 
	 * 
	 * * 
	 * * *
	 * * * *
	 * * * *
	 * * *
	 * *
	 *
	 
	 */

	public static void main(String[] args) {

		int n = 4;

		//outer for loop is for row
		for (int i = 1; i <= n; i++) {
			//inner for loop is for column
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.print("* ");
			System.out.println();
		}

	}

}
