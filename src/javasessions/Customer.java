package javasessions;

public class Customer {

	public void test() {
		System.out.println("test method");
	}
	
	public void test(int a) {//1 param
		System.out.println("test method "+a );
	}
	
	public void test(int a,int b) {//2 param
		System.out.println("test method "+a + b );
	}

	public void test(int a,String b) {//2 param
		System.out.println("test method "+a + b );
	}
	public void test(String a,int b) {//2 param
		System.out.println("test method "+a + b );
	}
	
	public void test(String a,int b, float f) {//3 param
		System.out.println("test method "+a + b +f );
	}
	public void test(float a,int b, String f) {//3 param
		System.out.println("test method "+a + b+f );
	}	
	
	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.test();
		obj.test(10);
		obj.test(11,22);
		obj.test(20, "Sonika");
		obj.test("Dev",50, 12.33f);
	}

}
