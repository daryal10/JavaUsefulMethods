package interfaceConcept;

public class AustrilianTraffic implements CentralTraffic {

	@Override
	public void greenGo() {
		System.out.println("greenGo method");

	}

	@Override
	public void redStop() {
		System.out.println("redStop method");

	}

	@Override
	public void flashYellow() {
		System.out.println("flashYellow Method..");

	}
	
	public static void main(String[] args) {
		
		AustrilianTraffic obj = new AustrilianTraffic();
		obj.greenGo();
		obj.flashYellow();
		obj.redStop();
		CentralTraffic.walk();
		obj.run();
		obj.sleep();
		
		
		
		
	}

}
