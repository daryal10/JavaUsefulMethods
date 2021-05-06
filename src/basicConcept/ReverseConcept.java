package basicConcept;

public class ReverseConcept {

	public static void main(String[] args) {
		reverseString("Hello");
		stringBuilder("MohanLal");
		
	}
	
	public static void reverseString(String a) {
		String str="";
		for(int i=a.length()-1;i>=0;i--) {
			str=str+a.charAt(i);
		}
		System.out.println(str);
	}
	
	public static void stringBuilder(String st) {
		StringBuilder sb= new StringBuilder(st);
		sb.reverse();
		System.out.println("Reverse of "+st +" is "+sb);
	}

}
