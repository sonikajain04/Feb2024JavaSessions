package OOPEncapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launching Browser");
		checkBrowserVersion();
		checkBrowserOSCompatibility();
		checkBrowserUpdates();
		checkBrowserLatestVerion();
		System.out.println("Browser is launched...");
		
	}
	private void checkBrowserVersion() {
		System.out.println("Check Browser version...");
	}
	private void checkBrowserOSCompatibility() {
		System.out.println("Check Browser OS Compatibility...");
	}
	private void checkBrowserUpdates() {
		System.out.println("check Browser Updates...");
	}
	private void checkBrowserLatestVerion() {
		System.out.println("check Browser Latest Verion...");
	}
}
