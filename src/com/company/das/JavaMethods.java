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

	// 13. FindFibonacci series
	public void findFibonacci(int a) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");

		for (int i = 2; i < a; i++) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	// 14. find maximum and minimum numbers from an array
	public void findMinAndMax(int a[]) {

		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if ((a[i]) > max) {
				max = a[i];
			}

			if ((a[i]) < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum in array is: " + max);
		System.out.println("Minimum in array is: " + min);
	}

	// 15. Check prime Number
	public static boolean isPrimeNumber(int num) {
		// System.out.println("The number is: "+num);
		// boolean isPrime=false;

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

	// 16 Range of PrimeNumbers
	public static void primeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				list.add(i);
			}
		}
		System.out.println("Size of the list " + list.size());
		System.out.println("List is: " + list);
	}

	// 17. Check Armstrong number
	public static boolean isArmstrongNumber(int num) {
		int rem;
		int cube = 0;
		int temp;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			cube = cube + (rem * rem * rem);
			num = num / 10;
		}
		if (temp == cube) {
			return true;
			// System.out.println(temp + " is the Armstrong number");
		} else {
			// System.out.println(temp + " is not an Armstrong number");
			return false;
		}
	}

	// 18. Armstrong Numbers upto given number
	public static void armstrongNumbers(int num) {
		System.out.println("Armstrong numbers upto: " + num + " ");
		for (int i = 0; i <= num; i++) {
			if (isArmstrongNumber(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 19. check if the number is palindrome number
	public static boolean isPalindrome(int num) {
		int rem;
		int sum = 0;
		int temp;
		temp = num;
		while (num != 0) {
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

	// 19..Palindrome numbers upto given integer
	public static void palindromeNumbers(int num) {
		System.out.print("Palindrome numbers are: ");
		for (int i = 1; i <= num; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 20. Fibonacci Series
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

	// 21. Reverse of a Number
	public static void reverseNum(int a) {
		int temp;
		int reverse = 0;
		int rem;
		temp = a;
		while (a != 0) {
			rem = a % 10;
			reverse = reverse * 10 + rem;
			a = a / 10;
		}
		System.out.println("Reverse of " + temp + " is " + reverse);
	}

	// 22. Finding area of a rectangle
	public static void areaOfRectangle(double length, double width) {
		double area = length * width;
		System.out.println("Area of Rectangle is: " + area);
	}

	// 22. Finding area of a square
	public static void areaOfSquare(double side) {
		double area = side * side;
		System.out.println("Area of Rectangle is: " + area);
	}

	// 23. Find area of a Circle
	public static void areaOfCircle(double radius) {
		double area = Math.PI * (radius * radius);
		System.out.println("Area of Circle is: " + area);
	}

	// 24.Swaping two arrays
	public static void swapString(String a, String b) {
		System.out.println("Before swap Value of firstString: " + a + " value of SecondString: " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After swap Value of firstString: " + a + " value of SecondString: " + b);
	}

	// 25. Digit count
	public static void digitCount(int num) {
		int count = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println(count + " is the number of digits of the given number:" + num);
	}

}
