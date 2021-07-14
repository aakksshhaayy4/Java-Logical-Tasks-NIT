package com.codewithakshay;

//Write a program to check whether the given number is prime or not

class IsItPrime {
	public static void main(String args[]) {
		int a = 7;
		int flag = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				flag = flag + 1;
			}
		}
		if (flag == 0) {
			System.out.println(a + " is prime Number");
		} else {
			System.out.println(a + " is not Prime Number");
		}
	}
}