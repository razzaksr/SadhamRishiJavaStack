package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

// call by reference/ address
public class PassingArrayToMethods {
	
	public void seek(int queen) {
		System.out.println("Received "+queen);
		queen+=10;
		System.out.println("After adding 10 "+queen);
	}
	
	public void hangout(int[] west) {
		System.out.println(Arrays.toString(west));
		west[1]=100;
		System.out.println(Arrays.toString(west));
	}
	
	public static void main(String[] args) {
		int[] stocks= {12,56,0,4,2,64,12,7,56,912,520,30,10};
		PassingArrayToMethods pass=new PassingArrayToMethods();
		pass.hangout(stocks);
		
		System.out.println(stocks[1]);
		
		pass.seek(stocks[5]);
		System.out.println(stocks[5]+" in main");
	}
}
