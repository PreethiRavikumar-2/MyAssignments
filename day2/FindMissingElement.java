package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int ranks[] = {6,5,3,2,8,1,7,9,10};
		int arrayLen = ranks.length;

		//Sorting an Array
		Arrays.sort(ranks);
		System.out.println("Elements of array sorted in ascending order: ");  

		for(int i=0 ; i<arrayLen ; i++)
		{
			System.out.println(ranks[i]);
		}

		//Missing Element

		for(int i=0 ; i<arrayLen ; i++)
		{
			if(i+1 != ranks[i])
			{
				System.out.println("Missing Element is "+ (i+1));
				break;
			}

		}

	}

}
