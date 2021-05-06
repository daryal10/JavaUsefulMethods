package basicConcept;

public class Multiplication {

	public static void main(String[] args) {
	System.out.println(	multiply(3,11));
	}
	
	
	public static int multiply(int i,int j) {
		int sum=0;
		int k=1;
		while(k<=j) {
			sum=sum+i;
			k++;
		}
		return sum;
	}

}
