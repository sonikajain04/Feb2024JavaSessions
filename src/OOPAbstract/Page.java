package OOPAbstract;

public abstract class Page {

	
	public Page() {
		System.out.println("Page --- default Const");
	}
	
	public Page(int a) {
		System.out.println("Page --- 1 param Const : "+a);
	}
	
	public Page(int a,int b) {
		System.out.println("Page --- 2 param Const : "+a+b);
	}
	public abstract void title();
	public abstract void url();

	public static final void displayLogo() {
		System.out.println("Page ---- display Logo");
	}
	public void getPageInfo() {
		System.out.println("Page ---- getPageInfo");
	}

}
