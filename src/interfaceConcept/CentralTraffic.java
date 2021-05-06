package interfaceConcept;

public interface CentralTraffic {
	
	public void greenGo();
	
	public void redStop();
	
	public void flashYellow();
	
	
	public static void walk() {
		System.out.println("Walking");
	}
	
	default void run() {
		System.out.println("Running");
	}
	
	default void sleep() {
	System.out.println("sleep");
	}
	
	

}
