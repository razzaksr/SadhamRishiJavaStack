package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Hierarchy {
	public static void main(String[] args) {
		Flipkart fp=new Flipkart();
		fp.transform();
		fp.view();
		
		Amazon am=new Amazon();
		am.erase();
		am.list();
	}
}

class Store{
	int[][] seek= {{90,34,12,55},{98,45,11,7,5,90,34,4,42},{1,78,0,56,23}};
	public void list() {
		for(int[] dim:seek) {
			System.out.println(Arrays.toString(dim));
		}
	}
}

class Flipkart extends Store{
	
	int[] each;
	public void transform() {
		int size=seek[0].length;
		size+=seek[1].length;
		size+=seek[2].length;
		each=new int[size];
		int index=0;
		for(int row=0;row<seek.length;row++) {
			for(int col=0;col<seek[row].length;col++) {
				each[index]=seek[row][col];index++;
			}
		}
	}
	
	public void view() {
		System.out.println(Arrays.toString(each));
	}
}

class Amazon extends Store{
	Scanner scan=new Scanner(System.in);
	public void erase() {
		System.out.println("Tell us criteria to delete ");
		int criteria=scan.nextInt();
		
		for(int row=0;row<seek.length;row++) {
			for(int col=0;col<seek[row].length;col++) {
				if(seek[row][col]>=criteria) {
					seek[row][col]=0;
					System.out.println(row+" and "+col+" has deleted");
				}
			}
		}
	}
}