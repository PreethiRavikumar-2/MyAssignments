package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {

		System.out.println("Browser " + browserName + " is launched successfully");
		return browserName;
	}

	void loadUrl() {

		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {

		Browser browserObj = new Browser();
		String name = browserObj.launchBrowser("Firefox");
		System.out.println(name);
		browserObj.loadUrl();
		
	}

}
