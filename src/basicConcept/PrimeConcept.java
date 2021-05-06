package basicConcept;

public class PrimeConcept {

	public static void main(String[] args) {
		isPrime(0);
		isPrime(1);
		isPrime(2);
		isPrime(3);
		isPrime(5);
		isPrime(6);
	}
	
	public static void isPrime(int a) {
		// prime Number 2,3,5,7,11,13,17,19,23,29
				boolean flag = false;
				
				if(a<=1) {
					flag=true;
				}
				
				for (int i = 2; i <= a/ 2; i++) {
					if (a % i == 0) {
						flag = true;
						break;
					}

				}
				if(flag) {
					System.out.println(a+" is not a prime number");
				}else {
					System.out.println(a+" is a prime number");
				}	}
}
