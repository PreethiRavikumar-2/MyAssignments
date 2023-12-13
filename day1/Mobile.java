package week1.day1;

public class Mobile {

	private void makeCall() {
		String mobileModel = "Sony";
		float mobileWeight = 200.2f;

		System.out.println("Inside makeCall method : " + mobileModel + " " + mobileWeight );

	}

	public boolean sendMsg() {

		boolean isFullCharged = true;
		int mobileCost = 110000;

		System.out.println("Sending message fully charged");
		return isFullCharged;

	}
	public static void main(String[] args) {

		Mobile obj = new Mobile();
		System.out.println("This is my mobile");

		obj.makeCall();
		System.out.println(obj.sendMsg());
		//System.out.println("Mobile cost is"+ obj.mobileCost); Not able to call method variables outside the method
	}

}
