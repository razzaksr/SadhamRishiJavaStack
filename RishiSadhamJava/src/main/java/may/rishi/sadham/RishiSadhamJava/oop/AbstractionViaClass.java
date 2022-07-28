package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class AbstractionViaClass extends Reed{
	public static void main(String[] args) {
		AbstractionViaClass obj=new AbstractionViaClass();
		obj.view();
		obj.readRow(2);
	}

	@Override
	public void readRow(int row) {
		// TODO Auto-generated method stub
		if(row<arr.length) {
			System.out.println(Arrays.toString(arr[row]));
		}
		else {
			System.out.println(row+" is extending the boundry");
		}
	}
}

abstract class Reed{
	int[][] arr= {{89,23,12,912,4},{89,33,45,24,67,245}};
	
	public abstract void readRow(int row);
	
	// non abstract
	public void view() {
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}
}