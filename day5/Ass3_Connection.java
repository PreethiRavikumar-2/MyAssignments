package week3.day5;

public class Ass3_Connection implements Ass3_DatabaseConnection {

	@Override
	public void connect() {

		System.out.println("Create Connection");

	}

	@Override
	public void disconnect() {

		System.out.println("Disconnect Connection");
	}

	@Override
	public void executeUpdate() {

		System.out.println("Update");
	}

	public static void main(String[] args) {

		Ass3_Connection obj = new Ass3_Connection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}

}
