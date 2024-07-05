package constructorConcept;

public class CarTest {

	public static void main(String[] args) {
//		Car c1=new Car("Alto", "Maruti");
//		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.licenseNumber+" "+c1.brand);

		
//		Car c1=new Car("X1", 70,"BMW");
//		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.licenseNumber+" "+c1.brand);

		Car c3=new Car("A6", 60,"6789","Audi");
		System.out.println(c3.name+" "+c3.price+" "+c3.color+" "+c3.licenseNumber+" "+c3.brand);
		c3.color="Black";
		System.out.println(c3.name+" "+c3.price+" "+c3.color+" "+c3.licenseNumber+" "+c3.brand);
	}

}
