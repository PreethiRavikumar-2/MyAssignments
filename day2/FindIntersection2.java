package week1.day2;

public class FindIntersection2 {

	public static void main(String[] args) { 

		int a[]={3,11,2,4,6,7}; //index of intersecting values are not same
		int b[]={1,2,8,4,9,7};

		for(int i=0; i<a.length; i++) {
			for(int j : b) { // using foreach loop

				if(a[i] == j) {

					System.out.println(a[i]);
				}
			}
		}

	}

}
