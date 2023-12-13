package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8;
		int[] series = new int[range];
		int n0=0, n1=1;
		System.out.println(n0);
		System.out.println(n1);


		for(int i=2 ; i<range ; i++) {   

			series[i] = n0+n1;
			System.out.println(series[i]);
			n0 = n1;
			n1 = series[i];
		}



	}

}
