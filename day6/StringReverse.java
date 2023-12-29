package week3.day6;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "TestLeaf";
		
		char[] charArray = str.toCharArray();
		
		for(int i = str.length()-1 ; i > 0 ; i--)
		{
			System.out.print(charArray[i]);
		}

	}

}
