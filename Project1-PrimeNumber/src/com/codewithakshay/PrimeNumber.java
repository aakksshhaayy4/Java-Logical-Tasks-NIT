package com.codewithakshay;

public class PrimeNumber {

	

	public static void main(String[] args) {

		// storing the value in variable which we want to check whether the number is
		// prime or not
		int n = 5;
		int flag = 0;

		// so, will check from 2.. till the given number
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = flag + 1;
			}
		}
		if (flag == 0) {
			System.out.println("It is Prime Number");
		} else {
			System.out.println("It is Not Prime Number");
		}

	}

}
