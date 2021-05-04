package com.company.das;

public class TestJavaMethods {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, -60, -50, -40, -30, 100 };
		int b[] = { -20, -30, -40, -50, -60 };
		int c[] = { 100, 200, 300, 400, -1000 };
		int d[] = { 1, 5, 3, 10, 5, 15, 8, 20 };
		int e[] = { 5, 10, 15, 20, 30, 15, 30 };
		String[] x = { "hari", "mohan", "dinesh", "hari", "prakash" };

		JavaMethods obj = new JavaMethods();

		obj.add(10, 10);
		obj.add(-100, -200);

		obj.subtract(20, 10);
		obj.subtract(30, 50);

		obj.divide(20, 4);
		obj.divide(40, 6);

		obj.multiply(3, 6);
		obj.multiply(4, -6);

		obj.modulus(10, 3);
		obj.modulus(40, 11);

		obj.naturalSum(50);
		obj.naturalSum(100);

		obj.oddNaturalSum(50);
		obj.oddNaturalSum(100);

		obj.evenNaturalSum(50);
		obj.evenNaturalSum(100);

		obj.evenOrOdd(10);
		obj.evenOrOdd(11);

		obj.negativeOrPositive(1);
		obj.negativeOrPositive(0);
		obj.negativeOrPositive(-1);

		obj.findFactorial(0);
		obj.findFactorial(4);
		obj.findFactorial(5);
		obj.findFactorial(6);

		obj.swapNumbers(10, 20);
		obj.swapNumbers(100, 200);

		obj.findFibonacci(10);
		obj.findFibonacci(20);

		obj.findMinAndMax(a);
		obj.findMinAndMax(b);

		System.out.println(JavaMethods.isPrimeNumber(1));
		System.out.println(JavaMethods.isPrimeNumber(2));
		System.out.println(JavaMethods.isPrimeNumber(4));
		System.out.println(JavaMethods.isPrimeNumber(5));
		System.out.println(JavaMethods.isPrimeNumber(11));

		JavaMethods.primeNumbers(20);
		JavaMethods.primeNumbers(100);

		System.out.println(JavaMethods.isArmstrongNumber(50));
		System.out.println(JavaMethods.isArmstrongNumber(1));
		System.out.println(JavaMethods.isArmstrongNumber(153));
		System.out.println(JavaMethods.isArmstrongNumber(370));
		System.out.println(JavaMethods.isArmstrongNumber(371));
		System.out.println(JavaMethods.isArmstrongNumber(409));

		JavaMethods.armstrongNumbers(100);
		JavaMethods.armstrongNumbers(300);
		JavaMethods.armstrongNumbers(100000000);

		System.out.println(JavaMethods.isPalindrome(121));
		System.out.println(JavaMethods.isPalindrome(131));
		System.out.println(JavaMethods.isPalindrome(123));

		JavaMethods.palindromeNumbers(100);
		JavaMethods.palindromeNumbers(200);
		JavaMethods.palindromeNumbers(1000);

		JavaMethods.fibonacciSeries(10);
		JavaMethods.fibonacciSeries(20);

		JavaMethods.reverseNum(100);
		JavaMethods.reverseNum(1234);
		JavaMethods.reverseNum(2345);

		JavaMethods.areaOfRectangle(2, 10);
		JavaMethods.areaOfRectangle(2, 10);

		JavaMethods.areaOfSquare(5);
		JavaMethods.areaOfSquare(10);

		JavaMethods.areaOfCircle(5);
		JavaMethods.areaOfCircle(10);

		JavaMethods.swapString("Ram", "Mohan");
		JavaMethods.swapString("pqr", "xyz");
		
		JavaMethods.digitCount(4);
		JavaMethods.digitCount(10);
		JavaMethods.digitCount(101);
		JavaMethods.digitCount(10004);
		

	}
}
