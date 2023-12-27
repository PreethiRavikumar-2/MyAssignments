package week3.day5;

public class Polymorphism {

	public void reportStep(String msg, String status) {

		System.out.println(msg + status);
	}

	public void reportStep(String msg, String status, boolean snap ) {

		System.out.println(msg + status + snap);
	}

	public static void main(String[] args) {

		Polymorphism obj = new Polymorphism();
		obj.reportStep("Hi", "Welcome");
		obj.reportStep("Hello", "New", false);
	}

}
