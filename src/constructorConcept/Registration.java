package constructorConcept;

public class Registration {
	String name;
	String emailId;
	String phone;
	int age;
	String city;
	String dob;
	static final String compName="IBM"; 

	public Registration(String name, String emailId) {
		this.name = name;
		this.emailId = emailId;
	}
	
	public Registration(String name, String emailId, String phone) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}	
	
	public Registration(String name, String emailId, String phone, String city) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.city = city;
	}

	public Registration(String name, String emailId, String phone, int age, String city, String dob) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}
	
	public static void main(String[] args) {
	Registration r1=new Registration("sonika","sonika@gmail.com");
	//System.out.println(r1.name+" "+r1.emailId+" "+r1.age+" "+r1.city+" "+r1.dob+" "+r1.phone);
	
	//Registration r2=new Registration("akansha","akansha@gmail.com","9882727181",30,"BLR","01-09-2000");	
	//System.out.println(r2.name+" "+r2.emailId+" "+r2.age+" "+r2.city+" "+r2.dob+" "+r2.phone);
	
	Registration r2=new Registration("akansha","akansha@gmail.com",null,30,"BLR",null);	
	System.out.println(r2.name+" "+r2.emailId+" "+r2.age+" "+r2.city+" "+r2.dob+" "+r2.phone);
	
	r2.phone="77777777777";
	System.out.println(r2.name+" "+r2.emailId+" "+r2.age+" "+r2.city+" "+r2.dob+" "+r2.phone);
	
	
	
	}

}
