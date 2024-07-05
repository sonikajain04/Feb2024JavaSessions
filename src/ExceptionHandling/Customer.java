package ExceptionHandling;

public class Customer {
	String name;
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		Customer obj=new Customer();
		
		obj=null;
		
		try {
			int i=9/0;//AE
			obj.name="Tom";//NPE
			System.out.println("Hello");
		}catch(ArithmeticException e ) {
			System.out.println("ArithmeticException is coming");
		}catch(NullPointerException e ) {
			System.out.println("NullPointerException is coming");
		}catch(Exception e ) {
			System.out.println("Some Exception is coming");
		}
		System.out.println("Exception handled");
		
		//checked exception
		//Thread.sleep(3000);
		
		//FileInputStream f=new FieInputStream();
	}
	

}
