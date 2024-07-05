package javasessions;

public class Car {
	
	String name;
	String licenseNumber;
	int price;
	int wheels;

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="Honda";
		c1.licenseNumber="12321";
		c1.price=20;
		c1.wheels=4;
		
		Car c2=new Car();
		c2.name="BMW";
		c2.licenseNumber="92321";
		c2.price=50;
		c2.wheels=4;

		Car c3=new Car();
		c3.name="Audi";
		c3.licenseNumber="82321";
		c3.price=60;
		c3.wheels=4;
	
	}

}
