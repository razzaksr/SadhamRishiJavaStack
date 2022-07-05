package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class Copying {
	public void doSome(char[] hey,int[] err) {
		for(int index=0;index<err.length;index++) {
			err[index]=hey[index];
		}
	}
	public static void main(String[] args) {
		char[] yet= {'R','A','Z','O','R'};// 
		int[] dest=new int[yet.length];
		
		Copying cop=new Copying();
		cop.doSome(yet, dest);
		
		System.out.println(Arrays.toString(dest));
	}
}
