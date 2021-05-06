package interfaceConcept;

public class Emirates extends AbstractConcept {
	
	//private are not allowed in abstract class
	//Abstract class cannot be instantate
	 

	@Override
	public void grow() {
		System.out.println("Grow implementation");
		
	}

	@Override
	public void feed() {
		System.out.println("Feed implementation");
		
	}

	@Override
	public void fertiliztion() {
		System.out.println("fertilization implementation");
		
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color implementation");
		
	}
	
	public static void main(String[] args) {
		Emirates obj = new Emirates();
		obj.feed();
		obj.fertiliztion();
		obj.bodyColor();
		obj.engine();
		obj.safetyGuidelines();
		
	}

}
