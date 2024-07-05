package javasessions;

public class Util {
	
	String name;
	int age;
	static String compName="Google";
	
	public void getInfo() {
		System.out.println("get info");
	}
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	
	public static void main(String[] args) {
	Util u=new Util();
	
	//how to access the non-static var and method
	u.name="Ekta";
	u.age=30;
	u.getInfo();
	
	System.out.println(Util.compName);
	
	//Static method with class name not with object name
	Util.sendMail();
	
	//directly calling static method
	sendMail();
	

	}

}
