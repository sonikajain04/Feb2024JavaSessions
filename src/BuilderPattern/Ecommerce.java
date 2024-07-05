package BuilderPattern;

public class Ecommerce {
	
	public Ecommerce login() {
		System.out.println("user logged in");
		return this;
	}

	public Ecommerce login(String username, String password) {
		System.out.println("user logged in with "+username);
		return this;
	}
	
	public Ecommerce search() {
		System.out.println("Default product search");
		return this;
	}
	
	public Ecommerce search(String productName) {
		System.out.println("Search the product as : "+productName);
		return this;
	}
	
	public Ecommerce search(String productName, int price) {
		System.out.println("Search the product as : "+productName);
		return this;
	}
	
	public Ecommerce addCart(String productName) {
		System.out.println("add to cart : "+productName);
		return this;
	}
	public Ecommerce payment(String upi) {
		System.out.println("make payment via upi: "+upi);
		return this;
	}
	public Ecommerce payment(String cc,int cvv) {
		System.out.println("make payment via cc: "+cc+" "+cvv);
		return this;
	}
	public Ecommerce generateOrder() {
		System.out.println("your order id is "+12345);
		return this;
	}
	
	public Ecommerce logout() {
		System.out.println("user is log out...");
		return this;
	}
}
