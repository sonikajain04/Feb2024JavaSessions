package OOPInterface;

public class HospitalTest {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		
		fh.physioServices();
		fh.dentalServices();
		fh.gastroServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.neuroServices();
		fh.gynecServices();
		fh.physioServices(20);
		
		fh.emergencyServices();
		
		fh.pathalogyServices();
		fh.medicalServices();
		
		System.out.println(USMedical.MIN_FEE);
		System.out.println(fh.MIN_FEE);
		
		USMedical.billing();
		FortisHospital.billing();
		
		fh.helpDesk();
		
		fh.covidVaccination();
		fh.medicalServices();
		
		fh.medicalNews();
		fh.medicalRND();
		
		//Top casting
		USMedical us=new FortisHospital();
		us.oncologyServices();
		us.physioServices();
		us.dentalServices();
		us.emergencyServices();
		
		

	}

}
