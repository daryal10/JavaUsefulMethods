package interfaceConcept;

public interface CentralTraffic {

	int a = 4;// public in nature by default

	public void greenGo();

	public void redStop();

	public void flashYellow();

	public static void walk() {
		System.out.println("Walking");
	}

	default void run() {
		System.out.println("Running");
	}

}
