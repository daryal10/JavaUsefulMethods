package inheritanceConcept;

public class TestVehicle {
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.getDetails();
		v.engine();
		v.wheels();
		
		Vehicle v1 = new Car();
		v1.getDetails();
		v1.engine();
		v1.wheels();
		//v1.autoSuspension();
		
		Car v2 = new Car();
		v2.getDetails();
		v2.engine();
		v2.wheels();
		v2.autoSuspension();
		
		/*
		System.out.println("-------------------");
		Car c = (Car) new Vehicle();// java.lang.ClassCastException  at runtime
		c.engine();
		c.getDetails();
		c.wheels();
		c.autoSuspension();
		
		*/
		
		
		
		
	}

}
