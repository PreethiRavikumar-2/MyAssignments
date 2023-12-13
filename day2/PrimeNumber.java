package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 3;
		
		for(int i=num-1 ; i>1 ; i--) {
			
			if(num%i != 0) {
				System.out.println("is prime");
			}
			else {
				System.out.println("is not prime");
			}
		}

	}

}
