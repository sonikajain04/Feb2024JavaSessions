package SuperKeyword;

public class BMW extends Car{
	
	int speed=200;
	int price=500;
	
	public BMW() {
		super(20);//Parameterized consturctor will be called
		System.out.println("BMW ----default const");
	}
	
	public BMW(int a) {
		System.out.println("BMW ----1 para const");
	}

	@Override
	public void loading() {
		System.out.println("BMW loading");
	}	
	
	@Override
	public void display() {
		super.display();
		
		System.out.println(speed);
		int carSpeed=super.speed;
		System.out.println(carSpeed);
		System.out.println("BMW----displayed");
		
		System.out.println(price+" BMW price");
		System.out.println(super.price+" Grand parent price");
		
		loading();
		super.loading();
		System.out.println();
	
	}

}
