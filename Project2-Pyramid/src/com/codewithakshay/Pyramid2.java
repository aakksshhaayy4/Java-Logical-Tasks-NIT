package com.codewithakshay;

import java.util.Scanner;

public class Pyramid2 {

	/*
	 * Pyramid program 
	 * we're taking the inputs from user by using Scanner class..
	 */
	
	public static void main(String[] args) {
		
		//creating Scanner object to take inputs from user
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number for building Pyramid");
		int num = scn.nextInt();
		
		//outer loop is for row's
		for(int i = 1; i<=num; i++) {
			//inner loop is for column's
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=num; i>=1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
