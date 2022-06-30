package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class CreatingAnArray {
	public static void main(String[] args) {
		// compile
		int[] yet= {56,90,23,13,45,24,6,1,19,3,4};
		System.out.println(yet.length);
		
		//String[] west= {"German","Ireland","Italy","France","Portuguise"};
		String[] west=new String[10];// run time
		System.out.println(west.length);
		
		//positions/index always starts with 0
		
		west[0]="German";
		west[1]="Italy";
		west[9]="England";
		// Arrays>> java.util
		System.out.println(Arrays.toString(yet));
		System.out.println(Arrays.toString(west));
	}
}
