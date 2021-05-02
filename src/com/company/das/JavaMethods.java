package com.company.das;

import java.util.ArrayList;
import java.util.List;

public class JavaMethods {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	// 1. Sum methods
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " & " + b + " = " + sum);
	}

	// 2. Subtract methods
	public void subtract(int a, int b) {
		int diff = a - b;
		System.out.println("Difference of " + a + " & " + b + " = " + diff);
	}

	// 3. Division methods
	public void divide(int a, int b) {
		int division = a / b;
		System.out.println("Division of  " + a + "  by  " + b + " = " + division);
	}

	// 4. Multiply methods
	public void multiply(int a, int b) {
		int multiplication = a * b;
		System.out.println("Multiplication of  " + a + " and  " + b + " = " + multiplication);
	}

	// 5. Remainder methods
	public void modulus(int a, int b) {
		int remainder = a % b;
		System.out.println("Remainder of  " + a + " divide by  " + b + " = " + remainder);
	}

	// 6.Sum of naturalNumbers
	public void naturalSum(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("The sum  from  0 to " + a + " is: " + sum);
	}

	// 7.Sum of naturalOdd Numbers
	public void oddNaturalSum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The sum  of odd numbers from  1 to " + a + " is: " + sum);
	}

	// 8.Sum of naturalNumbers
	public void evenNaturalSum(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The sum  of even numbers from  0 to " + a + " is: " + sum);
	}

	// 9. Find even or odd
	public void evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is an even number");
		} else
			System.out.println(a + " is an odd number");
	}

	// 10.Find negativePositive number
	public void negativeOrPositive(int a) {
		if (a >= 0) {
			System.out.println(a + " is a positive number");
		} else
			System.out.println(a + " is a negative number");
	}

	// 11.Find factorial
	public void findFactorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + "  is: " + fact);
	}

	// 12. Swap Two numbers
	public void swapNumbers(int a, int b) {
		System.out.println("Before swap:  a is: " + a + " b is: " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap:  a is: " + a + " b is: " + b);
	}

	//13. FindFibonacci series
	public void findFibonacci(int a) {
		int num1=0;
		int num2=1;
		System.out.println( num1+" "+num2);
		
		int sum=0;
		for(int i=2;i<=a;i++) {
		
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 1.Check Prime number
	public static boolean isPrimeNumber(int num) {
		// System.out.print("The number: "+num+" ");

		// check for boundary
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 2.Range of Prime Numbers
	public static void primeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				// System.out.print(i+" ");
				list.add(i);
			}
		}
		System.out.println("Size of the list: " + list.size());
		System.out.println(list);
	}

	// 3.Armstrong Number
	public static boolean isArmstrong(int num) {
		int rem;
		int cube = 0;
		int temp;

		temp = num;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			cube = cube + (rem * rem * rem);
		}
		if (temp == cube) {
			// System.out.println(temp + " is the Armstrong number");
			return true;
		} else {
			// System.out.println(temp + " is not an Armstrong number");
			return false;
		}
	}

	// 4. Armstrong Numbers upto given integer
	public static void armstrongNumbers(int num) {
		System.out.println("Armstrong numbers upto: " + num + " ");
		for (int i = 0; i <= num; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 5.Palindrome Number
	public static boolean isPalindrome(int num) {

		int rem;
		int sum = 0;
		int temp;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum * 10 + rem;
		}
		if (temp == sum) {
			// System.out.println(temp + " Number is palindrome");
			return true;
		}
		// System.out.println(temp + " Number is not a palindrome");
		return false;
	}

	// 6.Palindrome numbers upto given integer
	public static void palindromeNumbers(int num) {
		System.out.print("Palindrome numbers are: ");
		for (int i = 1; i <= num; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 7. Fibonacci Series
	public static void fibonacciSeries(int a) {
		List<Integer> fseries = new ArrayList<Integer>();
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		fseries.add(num1);
		fseries.add(num2);
		System.out.print(a + " fibonacci series Numbers are: ");
		// System.out.print(a + " fibonacci Numbers are: " + num1 + " " + num2 + " ");

		for (int i = 2; i < a; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			fseries.add(sum);
			// System.out.print(sum + " ");

		}
		System.out.println(fseries);
		// System.out.println();
	}

}
