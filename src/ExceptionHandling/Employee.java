package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {
		System.out.println("A");
		
		try {
			int i=9/0;//AE
		}
		catch(Error e){
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

}
