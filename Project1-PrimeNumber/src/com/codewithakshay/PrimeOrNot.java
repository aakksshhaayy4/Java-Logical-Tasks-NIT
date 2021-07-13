package com.codewithakshay;

class PrimeOrNot {
	
	/*
	 *In this program, we've implemented that
	 *will check whether the given number is prime or not..
	 *
	 */
	
	public static void main(String args[]) {
		int num = 4;
		int temp = 0;

		if (num == 0 && num == 1) {
			System.out.println("It is not Prime Number");
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("It is Prime Number");
		} else {
			System.out.println("It is not Prime Number");
		}

	}
}
