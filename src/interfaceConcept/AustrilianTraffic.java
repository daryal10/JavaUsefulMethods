package interfaceConcept;

public class AustrilianTraffic implements CentralTraffic {

	@Override
	public void greenGo() {
		System.out.println("greenGo method");

	}

	@Override
	public void redStop() {
		System.out.println("redStop method Implementation");

	}

	@Override
	public void flashYellow() {
		System.out.println("flashYellow Method Implementation");

	}

	public void  sleep() {
		System.out.println("sleep");
	}

	public static void main(String[] args) {

		CentralTraffic ct = new AustrilianTraffic();
		ct.greenGo();
		ct.flashYellow();
		ct.redStop();
		CentralTraffic.walk();
		ct.redStop();
		

		AustrilianTraffic obj = new AustrilianTraffic();
		obj.greenGo();
		obj.flashYellow();
		obj.redStop();
		obj.run();
		obj.sleep();

	}

}
