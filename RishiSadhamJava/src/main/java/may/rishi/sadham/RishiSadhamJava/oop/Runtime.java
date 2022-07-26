package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class Runtime extends Hawkeye implements Wink{
	
	// overriding is not mandate between class 
	public void swap() {
		System.out.println("Runtime swap");
		super.swap();
	}
	
	public static void main(String[] args) {
		Runtime hawk=new Runtime();
		hawk.list();
		hawk.swap();
		hawk.list();
		hawk.linear(12.9);
	}

	@Override
	public void linear(double user) {
		// TODO Auto-generated method stub
		for(int row=0;row<gen.length;row++) {
			for(int col=0;col<gen[row].length;col++) {
				if(gen[row][col]==user) {
					System.out.println(row+" and "+col+" where "+user+" available");
					return;
				}
			}
		}
		System.out.println(user+" down't match anywhere");
	}
}

interface Wink{
	double[][] gen = {{8.9,12.4,90.3},{11.5,3.4},{9.1,5.6,3.4,12.9,9.9,1.0}};
	public void linear(double user);
}

class Hawkeye{
	int[] version= {34,90,12,45,13,56};
	
	public void swap() {
		for(int start=0,end=version.length-1;start<end;start++,end--) {
			version[start]^=version[end];
			version[end]^=version[start];
			version[start]^=version[end];
		}
	}
	
	public void list() {
		System.out.println(Arrays.toString(version));
	}
}