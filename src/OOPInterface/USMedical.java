package OOPInterface;

public interface USMedical extends WHO, UN{
	
	int MIN_FEE=10;
	
	public void physioServices();
	
	public void physioServices(int a);
	
	public void oncologyServices();

	public void dentalServices();
	
	public void emergencyServices();

	public void ENTServices();
	
	//After JDK 1.8 ---static
	public static void billing() {
		System.out.println("US-----billing");
	}
	
	default void helpDesk() {
		System.out.println("US-----help Desk");
	}
}

