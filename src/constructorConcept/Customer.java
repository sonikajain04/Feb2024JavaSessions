package constructorConcept;

public class Customer {

	String name;
	int age;
	String device[];
	
	public Customer(String name, int age, String[] device) {
		this.name = name;
		this.age = age;
		this.device = device;
	}
	
	public String[] getDeviceInfo() {
		return device;
	}

	public int getDeviceCount() {
		return device.length;
	}
}
