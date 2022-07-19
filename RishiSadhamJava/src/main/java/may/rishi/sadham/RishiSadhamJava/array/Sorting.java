package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

public class Sorting {
	
	// On(logn)
	public void order(float[] arr) {
		
		// structure formation
		for(int init=arr.length/2-1;init>=0;init--) {
			heaping(arr, arr.length, init);
		}
		
		// swap between 0th index and maximum
		for(int pos=arr.length-1;pos>0;pos--) {
			float tmp=arr[0];
			arr[0]=arr[pos];
			arr[pos]=tmp;
			
			heaping(arr, pos, 0);
		}
	}
	
	public void heaping(float[] arr,int limit,int parent) {
		int biggest=parent;
		
		int lPos=2*parent+1;
		int rPos=2*parent+2;
		
		if(lPos<limit&&arr[lPos]>arr[biggest])
			biggest=lPos;
		if(rPos<limit&&arr[rPos]>arr[biggest])
			biggest=rPos;
		
		if(parent!=biggest) {
			float tmp=arr[parent];
			arr[parent]=arr[biggest];
			arr[biggest]=tmp;
			
			heaping(arr, limit, biggest);
		}
	}
	
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
		//st.bubble(geek);
		
		st.order(geek);
		
		System.out.println(Arrays.toString(geek));
	}
}
