package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class MultiSort {
	
	public void basicSort(int[][] arr) {
		for(int dimen=0;dimen<arr.length;dimen++) {
			Arrays.sort(arr[dimen]);
		}
	}
	
	public void view(int[][] arr) {
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}
	
	// O(n3)
	public void selectMulti(int[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int hold=0;hold<arr[row].length;hold++) {
				for(int com=hold+1;com<arr[row].length;com++) {
					if(arr[row][hold] < arr[row][com]) {
						arr[row][hold]^=arr[row][com];
						arr[row][com]^=arr[row][hold];
						arr[row][hold]^=arr[row][com];
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] capacity= {{8,2,3,16},{4,2,6},{16,2,4,4,3,1}};
		
		MultiSort mul=new MultiSort();
		//mul.basicSort(capacity);
		mul.selectMulti(capacity);
		mul.view(capacity);
	}
}
