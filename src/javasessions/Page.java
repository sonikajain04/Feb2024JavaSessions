package javasessions;

public class Page {

	
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		//direct call for overloaded main method
		main(10);
		main(10,20);	
		
		//call with class name
		Page.main(200);
		Page.main(200,300);
	}

	
	public static void main(int a) {
		System.out.println("hi "+a);
	}
	
	public static void main(int a,int b) {
		System.out.println("hi "+(a+b));
	}
}
