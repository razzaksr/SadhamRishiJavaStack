package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Scanner;

public class MultiRead {
	
	Scanner scan=new Scanner(System.in);
	
	public double justRead(double[][] arr) {
		System.out.println("Tell us which row ");
		int row=scan.nextInt();
		System.out.println("Tell us which column ");
		int col=scan.nextInt();
		
		if(row<arr.length&&col<arr[row].length) {
			return arr[row][col];
		}
		else
			return 0;
	}
	
	public void readByCondition(double[][] arr) {
		System.out.println("Tell us minimum value to read matches ");
		double data=scan.nextDouble();
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>=data) {
					System.out.println(arr[row][col]+" match found @ "+row+" and "+col);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		double[][] term= {{8.9,12.5,1.3},{90.5,0.89},{4.5,6.7,31.2,1.8,5.6}};
		
		MultiRead read=new MultiRead();
		//System.out.println(read.justRead(term));
		read.readByCondition(term);
	}
}
