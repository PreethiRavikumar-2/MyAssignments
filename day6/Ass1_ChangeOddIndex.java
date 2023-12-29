package week3.day6;

public class Ass1_ChangeOddIndex {

	public static void main(String[] args) {

		String str = "changeme";

		char[] charArray = str.toCharArray();

		for(int i = 0 ; i < str.length() ; i++)
		{
			char temp = charArray[i];
			
			if(i % 2 != 0) {
				char upperCase = Character.toUpperCase(temp);				
				System.out.print(upperCase);
			}


			else {
				System.out.print(charArray[i]);
			}
		}

	}

}
