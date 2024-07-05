package OOPAbstract;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage(10);
		LoginPage lp1=new LoginPage(10,20);	
		lp.title();
		lp.url();
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.getPageInfo();
		
		lp.doLogin("admin","admin");
	
	//Top Casting
	//	Page p=new Page(); not allowed
	
//		Page p=new LoginPage();
//		p.title();
//		p.url();
//		p.getPageInfo();
//	
//		p.displayLogo();
	}
}
