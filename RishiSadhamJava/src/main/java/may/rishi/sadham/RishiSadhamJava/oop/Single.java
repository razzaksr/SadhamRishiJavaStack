package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class Single {
	public static void main(String[] args) {
		Assist asit=new Assist();
		asit.view();
		asit.bubble();
		asit.view();
	}
}

class Ware{
	double[][] hex= {{9.1,8.9,4.5},{78.3,12.4},{11.9,9.17,8.3,5.6,1.2,6.8}};
	public void view() {
		for(double[] dim:hex) {
			System.out.println(Arrays.toString(dim));
		}
	}
}
// single inheritance
class Assist extends Ware{
	public void bubble() {
		for(int row=0;row<hex.length;row++) {
			for(int times=0;times<hex[row].length-1;times++) {
				for(int bub=0;bub<hex[row].length-times-1;bub++) {
					if(hex[row][bub]>hex[row][bub+1]) {
						hex[row][bub]*=hex[row][bub+1];
						hex[row][bub+1]=hex[row][bub]/hex[row][bub+1];
						hex[row][bub]/=hex[row][bub+1];
					}
				}
			}
		}
	}
}