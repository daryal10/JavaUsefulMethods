package com.company.das;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static boolean isPrime(int num) {
		// Checking for the condition that is not prime
		if (num <= 0) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeNumbers(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println("Prime Numbers upto : "+num+" are " + list);
	}

	
	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		
		primeNumbers(20);
		primeNumbers(50);
		primeNumbers(100);
		

	}

}
