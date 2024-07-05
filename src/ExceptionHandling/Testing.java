package ExceptionHandling;

public class Testing {

	public static void main(String[] args) {
		int a[]=new int [3];
		//Business logic
		
		try {
		a[3]=10;//AIOB - Runtime exception
		//No Business logic
		
		System.out.println("value "+a);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
