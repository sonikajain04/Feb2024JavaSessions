package SuperKeyword;

public class Vehicle {
	int price=900;

	public Vehicle() {
		System.out.println("Vehicle----default constructor");
	}
	
	public Vehicle(String name) {
		System.out.println("Vehicle----default constructor"+name);
	}
	
	public void loading() {
		System.out.println("Vehicle loading");
	}	
}
