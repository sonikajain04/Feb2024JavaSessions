package constructorConcept;

public class LoginPage {

	String userName;
	String password;
	

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void login() {
		System.out.println("enter username "+userName);
		System.out.println("enter password "+password);
		System.out.println("click on login button");
		System.out.println("login is done");
	}
	public static void main(String[] args) {
	
	LoginPage lp1=new LoginPage("deepak","deepak123");
	lp1.login();
	
	LoginPage lp2=new LoginPage("ravi","ravi123");
	lp2.login();
	
	}
}
