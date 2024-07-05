package SuperKeyword;

public class Car extends Vehicle{
	int speed=100;
	int price=900;
	
	public Car() {
		System.out.println("Car --- default const");
	}
	public Car(int a) {
		System.out.println("Car --- 1 para const");
	}
	public void display() {
		System.out.println("Car "+speed);
	}
	
	@Override
	public void loading() {
		System.out.println("CAR loading");
		super.loading();
	}

}
