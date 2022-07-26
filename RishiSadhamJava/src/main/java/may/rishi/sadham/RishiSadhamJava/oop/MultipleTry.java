package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleTry {
	public static void main(String[] args) {
		Combine com=new Combine();
		com.getSome();
		com.view();
	}
}

class Combine extends Cyclone{
	public void getSome() {
		Scanner scan=new Scanner(System.in);
		
		for(int row=0;row<chain.length;row++) {
			System.out.println("Tell us no of columns in "+row);
			int size=scan.nextInt();
			chain[row]=new int[size];
			for(int col=0;col<chain[row].length;col++) {
				System.out.println("Tell us value for "+col);
				chain[row][col]=scan.nextInt();
			}
		}
	}
}

class Cyclone{
	int[][] chain= new int[3][];
	public void view() {
		for(int[] dim:chain) {
			System.out.println(Arrays.toString(dim));
		}
	}
}

class Access{
	public void getSort(int[][] ord) {
		for(int row=0;row<ord.length;row++) {
			Arrays.sort(ord[row]);
		}
	}
}