package constructorConcept;

public class Employee {

	String name;
	int age;
	double salary;
	
	//Constructor:
	//1. name is same as class name
	//2. it looks like function but it is not function
	//3. Cannot return anything, no void, no return type.
	//4. can be overloaded
	
	//Uses of constructor:
	//1. will be called when you create the object
	//2. will help to initialize the variables
	//3. will help to restrict the object creation
	
	public Employee() {
		System.out.println("default constructor");
	}
    public Employee(int a) {
    	System.out.println("1 para "+a);
	}
    
    public Employee(int a,int b) {
    	System.out.println("2 para "+a+b);
	}
    
    public Employee(String name) {
    	this.name=name;
	}
    public Employee(String name,int age) {
    	this.name=name;
    	this.age=age;
	}
    public Employee(String name,int age,double salary) {
    	this.name=name;
    	this.age=age;
    	this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Tom");
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		Employee e2=new Employee("Peter",20);
		System.out.println(e2.name);
		System.out.println(e2.age);
		
		Employee e3=new Employee("Ekta",50,34.55);
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.salary);
	}

}
