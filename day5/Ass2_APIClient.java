package week3.day5;

public class Ass2_APIClient {

	private void sendRequest(String endpoint) {

		System.out.println("Endpoint");

	}

	private void sendRequest(String endpoint, String requestBody, boolean requestStatus) {

		System.out.println("3 parameters");

	}

	public static void main(String[] args) {
		
		Ass2_APIClient obj = new Ass2_APIClient();
		obj.sendRequest("endpoint");
		obj.sendRequest("point", "Body", false);

	}

}
