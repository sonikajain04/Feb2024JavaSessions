package OOPInheritance;

public class Car extends Vehicle{
	
	int minSpeed=100;
	
	
	public final void testDrive() {
		System.out.println("Car-----testDrive");
	}
	public void start() {
		System.out.println("Car-----Start");
	}
	public void stop() {
		System.out.println("Car-----Stop");
	}
	public void refuel() {
		System.out.println("Car-----refuel");
	}
	@Override
	public void engine() {
		System.out.println("Car-----engine");
	}
	
	public static void billing() {
		System.out.println("Car----billing");
	}
	
	private void service() {
		System.out.println("Car----service");
	}
}
