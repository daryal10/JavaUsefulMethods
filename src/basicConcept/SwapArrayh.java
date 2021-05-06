package basicConcept;

public class SwapArrayh {

	public static void main(String[] args) {
		int temp;
		int a=4;
		int b=5;
		System.out.println("Before Swap a: "+a);
		System.out.println("Before Swap b: "+b);
		
		temp=a;
		a=b;;
		b=temp;
		System.out.println("After Swap a: "+a);
		System.out.println("After Swap b: "+b);
		
		//Swap without temp variable
		a=a+b;
		b=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
