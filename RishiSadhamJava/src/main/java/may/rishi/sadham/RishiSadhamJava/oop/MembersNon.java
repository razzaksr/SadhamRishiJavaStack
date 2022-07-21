package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

import may.rishi.sadham.RishiSadhamJava.oop.SeekSome.Sadham;

// inner class/ member class as non static

public class MembersNon {
	public static void main(String[] args) {
		SeekSome seek=new SeekSome();
		seek.view();
		Sadham sa=seek.new Sadham();
		sa.copy();
		sa.viewDest();
	}
}

class SeekSome{
	int[][] hai= {{3,41,2,90},{10,4,2,100,78,34},{20,11}};
	
	public void view() {
		for(int[] each:hai) {
			System.out.println(Arrays.toString(each));
		}
	}
	
	class Sadham{
		int[][] dest=new int[hai.length][];
		
		public void copy() {
			for(int row=0;row<dest.length;row++) {
				int size=hai[row].length;
				dest[row]=new int[size];
				for(int col=0;col<dest[row].length;col++) {
					dest[row][col]=(int)(hai[row][col]-(hai[row][col]*0.500));
				}
			}
		}
		
		public void viewDest() {
			for(int[] each : dest) {
				System.out.println(Arrays.toString(each));
			}
		}
	}
	
}