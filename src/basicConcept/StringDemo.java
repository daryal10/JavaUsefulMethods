package basicConcept;

public class StringDemo {

	public static void main(String[] args) {
		
		//StringBuilder is not thread safe. It is non synchronized. It allows multiple threads to make modification at a time.
		// StringBuffer is thread Safe. It is synchronized.
		//StringBuilder and StringBuffer are mutable in java. StringBuilder is faster than StringBuffer class.
		
		//When you run stuffs in parallel then it is safe to use StringBuffer.
		
		//String is immutable in java. It can't be  changed or changed
		String a = "hello";// String literal
		String b = "hello";
		
		a.concat("World");

		//String class creates new object every time in memory
		String s = new String("hello");
		String s1= new String("hello");
		s1.concat("Ram");
		s.concat("Sita");
		
		System.out.println(a);
	
		//checks for the content of Strings if content matches returns true else returns false
		System.out.println(a.equals(b));//true
		System.out.println(a.equals(s));//true
		System.out.println(a.equals(s1));//true
		System.out.println(s.equals(s1));//true
		
		
		//Matching the references: if the references are pointing the same object then true else returns false
		System.out.println(a==b);//true
		
		System.out.println(b==s);//false
		System.out.println(a==s);//false
		System.out.println(s==s1);//false -- because references are different as they are defined with string class
		
		//StringBuffer: mutable in java
		StringBuffer sb= new StringBuffer("hello");
		sb.append("java");
		System.out.println(sb);
		sb.insert(2,"Sita");
		System.out.println(sb);
		sb.replace(2, 6, "Ram");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//StringBuilder
		StringBuilder sbv= new StringBuilder("Hello");
		System.out.println(sbv);
		
		
		
		

		

	}

}
