package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

/*
 * type[][] var/obj={{v1,v2,v3},{v1,v2,v3},{v1,v2,v3}};
 * 
 * type[][] var/obj=new type[row-size][col-size];
 * 
 * Operations:
 * 
 * Create
 * List
 * Search
 * Read
 * Update
 * Sort
 * 
 * delete
 * 
 */

public class MultiDim{
	public static void main(String[] args) {
		// multi dimensional
		double[][] intrest= {{4.5,2.1,8.9,12.7,3.4},{9.1,8.2,12.5,3.3,8.1},
				{4.9,8.2,7.8,5.45,9.2}};
		
		// jagged
		int[][] some= {{4,7,99,12,55},{63,19},{78,56,61,78,13,41},{89,49,33,28,61}};
		
		//System.out.println(Arrays.toString(intrest));
		
		// row count
		System.out.println(intrest.length);
		System.out.println(some.length);
		
//		// list O(n)
//		for(int row=0;row<intrest.length;row++) {
//			System.out.println(Arrays.toString(intrest[row]));
//		}
//		
//		// list O(n)
//		for(int pos=0;pos<some.length;pos++) {
//			System.out.println(Arrays.toString(some[pos]));
//		}
		
//		// O(n)
//		for(double[] ptr:intrest) {
//			System.out.println(Arrays.toString(ptr));
//		}
//		
//		// O(n)
//		for(int[] ptr:some) {
//			System.out.println(Arrays.toString(ptr));
//		}
		
		// O(n2)
//		for(int row=0;row<intrest.length;row++) {
//			for(int data=0;data<intrest[row].length;data++) {
//				System.out.print(intrest[row][data]+" ");
//			}
//			System.out.println();
//		}
//		
//		// O(n2)
//		for(int row=0;row<some.length;row++) {
//			for(int col=0;col<some[row].length;col++) {
//				System.out.print(some[row][col]+" ");
//			}
//			System.out.println();
//		}
		
		
		// O(n2)
		for(double[] row:intrest) {
			for(double each:row) {
				System.out.print(each+" ");
			}
			System.out.println();
		}
		
		for(int[] row:some) {
			for(int ptr:row) {
				System.out.print(ptr+" ");
			}
			System.out.println();
		}
	}
}
