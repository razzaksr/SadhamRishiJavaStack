package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class Sorting {
	
	// time complexity		: 		O(n2)
	public void selection(float[] arr) {
		for(int select=0;select<arr.length;select++) {
			for(int comp=select+1;comp<arr.length;comp++) {
				if(arr[select]<arr[comp]) {
					arr[select]*=arr[comp];
					arr[comp]=arr[select]/arr[comp];
					arr[select]=arr[select]/arr[comp];
				}
			}
		}
	}
	
	public void bubble(float[] arr) {
		for(int times=0;times<arr.length-1;times++) {
			for(int bub=0;bub<arr.length-times-1;bub++) {
				if(arr[bub]>arr[bub+1]) {
					arr[bub]+=arr[bub+1];
					arr[bub+1]=arr[bub]-arr[bub+1];
					arr[bub]=arr[bub]-arr[bub+1];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		float[] geek= {3.4F,8.9F,12.3F,7.4F,89.5F,12.9F,45.2F,7.1F,4.5F};
		Sorting st=new Sorting();
		System.out.println(Arrays.toString(geek));
		
		//st.selection(geek);
		st.bubble(geek);
		
		System.out.println(Arrays.toString(geek));
	}
}
