package constructorConcept;

import java.util.Arrays;

public class CustomerTest {

	public static void main(String[] args) {
		
		String d[]= {"Mac book", "Sumsung", "Keyboard","Mouse"};
		Customer obj=new Customer("Rahul", 30,d);
		String rahulDev[]=obj.getDeviceInfo();
	
		System.out.println(Arrays.toString(rahulDev));
		System.out.println(obj.getDeviceCount());
		
		Browser.get();
		Browser.close();
	}

}
