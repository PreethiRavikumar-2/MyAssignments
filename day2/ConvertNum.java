package week1.day2;

public class ConvertNum {

	public static void main(String[] args) {

		int num = -16; //Convert negative number to positive

		if(num > 0) {
			System.out.println("Number is postive");
		}
		else if(num < 0){
			System.out.println("Number is negative");
			int convertedNum = num - (2*num); // 16 - (32) which becomes +16
			System.out.println(num +" is converted to +"+convertedNum);
		}
		else {
			System.out.println("Number is neutral");
		}
			

	}
}
