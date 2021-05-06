package basicConcept;

public class ReverseNum {

	public static void main(String[] args) {
		reverseNum(345);
		reverseNum(645);
		reverseNum(4009605);

	}

	public static void reverseNum(int a) {
		int reverse = 0;
		int temp = a;
		while (a != 0) {
			int rem=a%10;
			reverse = reverse * 10 + rem;
			a = a / 10;
		}
		System.out.println("Reverse of " + temp + " = " + reverse);
	}

}
