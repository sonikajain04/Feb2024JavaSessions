package AccessModifier;

public class BMW extends Car{

//case 1:
//	@Override
//	public void test() {
//	System.out.println("BMW --- test");
//}

//case 2: private not allowed
//	@Override
//	private void test() {
//	System.out.println("BMW --- test");
//}
	
//case 3: Protected allowed
	@Override
	protected void test() {
	System.out.println("BMW --- test");
}
	public static void main(String[] args) {
		
		BMW b=new BMW();
		

	}

}
