package javasessions;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//range 128 to -127
		byte a=100;
		byte b=110;

		//byte c=a+b;//not allowed
		//short  c=a+b;//not allowed
		
		int c=a+b;
		System.out.println(c);//210
	}

}
