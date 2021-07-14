package com.codewithakshay;

public class PrimeNumbersFrom1ToN {
	
	/*
	 * Prime Numbers from 1 to N
	 */

	public static void main(String[] args) {
		
		int maxVal=100;
		boolean isPrime=true;
		String primeNum="";
		int count=0;
		
		for(int i=2; i<=maxVal; i++) {
			isPrime=checkPrime(i);
			if(isPrime) {
				primeNum=primeNum+i+" ";
				count=count+1;
			}
		}
		System.out.println("Prime Numbers from 1 to "+maxVal+" are :- "+primeNum);
		System.out.println("TOtal Prime numbers between 1 to "+maxVal+" is :- "+count);

	}

	public static boolean checkPrime(int num) {
		int rem=0;
		for(int i=2; i<=num/2; i++) {
			rem=num%i;
			if(rem==0) {
				return false;
			}
		}
		return true;
	}

}
