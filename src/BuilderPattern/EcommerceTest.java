package BuilderPattern;

public class EcommerceTest {

	public static void main(String[] args) {
		Ecommerce obj=new Ecommerce();

		obj.login("Sonika","Sonika123")
			.search("Macbook")
			.addCart("Macbook")
			.payment("121 121 121 234",333)
			.generateOrder()
			.logout();
		System.out.println("----------------------------------------------");
		obj.login("Ravi","Ravi123")
			.logout();
		System.out.println("----------------------------------------------");
		obj.login("Ekta","Ekta987")
			.search("Keyboard")
			.addCart("Keyboard")
			.logout();
	}

}
