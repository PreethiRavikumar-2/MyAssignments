package week3.day6;

import java.util.Arrays;

public class Ass2_SecondLargestNumber {

	public static void main(String[] args) {

		int[] numbers = {3, 2, 11, 4, 6, 7};

		Arrays.sort(numbers);

		for(int i = 0 ; i < numbers.length ;  i++) {
			System.out.println(numbers[i]);
		}
		
		int num = numbers[numbers.length-2];
		
		System.out.println("Second Largest number: " + num);

	}

}
