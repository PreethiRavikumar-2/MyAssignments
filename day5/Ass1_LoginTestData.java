package week3.day5;

public class Ass1_LoginTestData extends Ass1_TestData {
	
	private void enterUsername() {
		System.out.println("Enter the Username");

	}
	
	private void enterPassword() {
		System.out.println("Enter the password");

	}
	

	public static void main(String[] args) {
	
		Ass1_LoginTestData data = new Ass1_LoginTestData();
		data.enterCredentials();
		data.enterUsername();
		data.enterPassword();
	}

}
