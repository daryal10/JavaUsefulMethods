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

		
		
		

	}
}
