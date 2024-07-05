package OOPInterface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical{

	int MIN_FEE=50;
	
	@Override
	public void physioServices() {
		System.out.println("FH---physio Services");
	}
	@Override
	public void physioServices(int a) {
		System.out.println("FH---physio Services with parameter "+a);
	}
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncology Services");
	}
	@Override
	public void dentalServices() {
		System.out.println("FH---Dental Services");
	}
	@Override
	public void gynecServices() {
		System.out.println("FH---gynec Services");
	}
	@Override
	public void gastroServices() {
		System.out.println("FH---gastro Services");
	}
	@Override
	public void pediaServices() {
		System.out.println("FH---pedia Services");
	}
	
	@Override
	public void neuroServices() {
		System.out.println("FH---neuro Services");
	}
	//Common
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergency Services");
	}
	
	//Individual Methods
	public void medicalServices() {
		System.out.println("FH---Medical Services");
	}
	
	public void pathalogyServices() {
		System.out.println("FH---Pathalogy Services");
	}

	@Override
	public void ENTServices() {
		System.out.println("FH---ENT Services");
	}
	//method hiding
	public static void billing() {
		System.out.println("FH-----billing");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH-----help Desk");
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH-----covidVaccination Desk");
	}
	@Override
	public void medicalNews() {
		System.out.println("FH ---- Medical News");
	}
	
	@Override
	public void medicalRND() {
		System.out.println("FH ---- Medical RND ");
	}
	@Override
	public void bloodTest() {
		System.out.println("FH ---- blood Test");
	}
}
