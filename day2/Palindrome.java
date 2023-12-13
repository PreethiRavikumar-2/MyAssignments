package week1.day2;

public class Palindrome {

	public static void main(String[] args) {


		int input = 121; //Palindrome number
		//int input = 12345; //Not a Palindrome number
		int remainder, sum=0;

		for(int i=input; i>0 ; i=i/10)
		{
			remainder = i%10;
			sum = (sum*10)+remainder;

		}

		System.out.println("Reversed number "+sum);
		if(sum==input)
		{
			System.out.println(input+" is a Palindrome number");
		}
		else
		{			
			System.out.println(input+" is Not a Palindrome number");
		}

	}  


}
