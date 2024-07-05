package OOPInheritance;

public class CarTest {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		BMW.billing();//c
		Car.billing();
		b.BMWService();
		
		System.out.println("BMW min Speed "+b.minSpeed);
		
		System.out.println("------------------------");
		
		Audi au=new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.engine();
		au.theftSafty();
		
		System.out.println("------------------------");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.drive();
		System.out.println("Car min Speed "+c.minSpeed);
		
		System.out.println("------------------------");
		//child class object can be referred by parent class ref varibale
		//Top casting
		Vehicle v1=new BMW();
		v1.engine();
		v1.drive();
		
		System.out.println("------------------------");
		Truck t=new Truck();
		t.drive();
		t.engine();
		t.heavyLoading();
		

	}

}
