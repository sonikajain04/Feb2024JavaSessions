package OOPEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		Customer obj=new Customer("Ayesha",20, 23.44,true);
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isActive());

		obj.setSalary(35);
		obj.setAge(23);
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isActive());
		
		Customer c1=new Customer();
		c1.setName("Ravi");
		c1.setAge(30);
		c1.setSalary(45.22);
		c1.setActive(true);
		
		System.out.println(c1.getName()+" "+c1.getAge()+" "+c1.getSalary()+" "+c1.isActive());
	}

}
