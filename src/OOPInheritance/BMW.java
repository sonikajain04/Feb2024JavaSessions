package OOPInheritance;

public class BMW extends Car{
	int minSpeed=200;
	
	@Override
	public void start() {
		System.out.println("BMW----Start");
	}

	public void autoParking() {
		System.out.println("BMW----auto parking");
	}
	@Override
	public void engine() {
		System.out.println("BMW-----engine");
	}
	
//	//@Override
//	public static void billing() {
//		System.out.println("BMW-----billing");
//	}
	
	//not @Override
	private void service() {
		System.out.println("BMW----service");
	}
	
	public void BMWService() {
		service();
	}
}
