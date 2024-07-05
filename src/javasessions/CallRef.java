package javasessions;

public class CallRef {

	String name;
	int age;
	
	public static void test(CallRef t1) {
		System.out.println("test method");
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}
	public static void main(String[] args) {
		CallRef obj= new CallRef();
		obj.name="Ravi";
		obj.age=30;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		CallRef.test(obj);
	}

}
