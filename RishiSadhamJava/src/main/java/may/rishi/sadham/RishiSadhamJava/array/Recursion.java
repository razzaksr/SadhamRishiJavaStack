package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class Recursion {
	
	public void haiThere() {
		System.out.println("This is simple recursion");
		haiThere();
	}
	
	public void yetAnother(int wind) {
		if(wind<=20) {
			System.out.println("Finite Recursion "+wind);
			wind++;
			yetAnother(wind);
		}
		return;
	}
	
	public void showSome(float[] arr) {
		System.out.println("Printing array values...................");
		for(float tmp:arr) {
			System.out.println(tmp);
		}
	}
	
	public void listingArray(float[] err,int current) {
		if(current<err.length) {
			System.out.println(err[current]);
			current++;
			listingArray(err, current);
		}
		return;
	}
	
	public static void main(String[] args) {
		float[] upper= {1.4F,9.2F,89.4F,0.099F,5.6F,4.1F};
		Recursion recur=new Recursion();
		//recur.haiThere();// infinite recursion
		//recur.yetAnother(10);//finite recursion like loop
		//System.out.println(Arrays.toString(upper));
//		for(int index=0;index<upper.length;index++) {
//			System.out.println(upper[index]);
//		}
		
		//recur.showSome(upper);
		
		recur.listingArray(upper, 0);
	}
}
