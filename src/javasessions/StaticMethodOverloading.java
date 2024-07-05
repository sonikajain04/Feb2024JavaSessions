package javasessions;

public class StaticMethodOverloading {

	public static void sendMail() {
		System.out.println("send mail");
	}
	public static void sendMail(int a) {
		System.out.println("send mail "+a);
	}
	public static void sendMail(int a, int b) {
		System.out.println("send mail "+(a+b));
	}
	public static void sendMail(String a, int b) {
		System.out.println("send mail "+a+b);
	}
	public static void main(String[] args) {
		StaticMethodOverloading.sendMail();
		StaticMethodOverloading.sendMail(50);
		StaticMethodOverloading.sendMail(200,800);
		StaticMethodOverloading.sendMail("testing ", 123);
	}

}
