package OOPAbstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("Login Page --- default Const");
	}
	
	public LoginPage(int a) {
		System.out.println("Login Page --- 1 param Const : "+a);
	}
	
	public LoginPage(int a,int b) {
		System.out.println("Login Page --- 2 param Const : "+a+b);
	}
	
	@Override
	public void title() {
		System.out.println("LoginPage----title");
	}

	@Override
	public void url() {
		System.out.println("LoginPage----url");
	}

	public void doLogin(String username, String pwd) {
		System.out.println("User logged in "+username+" "+pwd);
	}
}
