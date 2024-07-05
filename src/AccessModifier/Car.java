package AccessModifier;

public class Car {

	public String name;
	private int price;
	protected double milage;
	String color;
	
	//case 1
//	public void test() {
//		System.out.println("Car --- test");
//	}
	//case 2 - //Private method can't be overridden
//	private void test() { 
//		System.out.println("Car --- test");
//	}
	
	//case 3 - Protected method can be overridden within same package/different package
	//but with non child class
	protected void test() {
		System.out.println("Car --- protected");
	}
	public static void main(String[] args) {
		Car c=new Car();

	}

}
