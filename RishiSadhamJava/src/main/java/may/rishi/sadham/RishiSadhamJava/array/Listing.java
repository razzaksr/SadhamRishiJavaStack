package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;


// array traverse
public class Listing {
	public static void main(String[] args) {
		double[] yet= {3.4,9.1,45.8,12.9,5.6,12.1,4.2,0.98,1.5,7.2};
		double tee=9.1;
		//System.out.println(Arrays.toString(yet));// O(1)
		
//		System.out.println(yet[0]);
//		System.out.println(yet[1]);
//		System.out.println(yet[2]);
//		System.out.println(yet[3]);
//		System.out.println(yet[4]);
//		//System.out.println(yet[yet.length-1]);
		
		// O(n)			n - no of elements / steps 
//		for(int pos=2;pos<yet.length-1;pos++) {
//			System.out.println(yet[pos]);
//		}
		
		//for Each : O(n)
		for(double t : yet) {
			System.out.println(t);
		}
		
		//System.out.println(yet+" "+tee);
		
	}
}
