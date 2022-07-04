package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingIntoArray {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String[] harvey = new String[10];
		
//		harvey[0]=scan.nextLine();
//		harvey[1]=scan.nextLine();
//		harvey[2]=scan.nextLine();
//		harvey[3]=scan.nextLine();
		
		// inserting 		O(n)
		for(int index=0;index<harvey.length;index+=2) {
			System.out.println("Please enter your name ");
			harvey[index]=scan.nextLine();
		}
		
		// for each cannot be used for array element changes
//		for(String trp:harvey) {
//			System.out.println("Please enter your name ");
//			trp=scan.nextLine();
//		}
		
		System.out.println(Arrays.toString(harvey));
		
		scan.close();
	}
}
