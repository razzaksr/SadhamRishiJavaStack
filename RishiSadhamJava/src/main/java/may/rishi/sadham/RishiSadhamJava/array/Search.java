package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;

/*
 * search:
 * 	Linear: range: start to end(visiting each pos and compare user given value) >> O(n)
 * 			logic: over the unsorted/ doesn't have any order array
 * 	binary: range: diplomatic(mid point)			>> O(logn)
 * 			logic: over the sorted array(either ascending or descending)
 */

public class Search {
	
	
	// O(n)
	public int linearRecursion(String[] arr,String data,int current) {
		if(current<arr.length) {
			// compareTo 
			if(arr[current].compareToIgnoreCase(data)==0)
				return current;
			
			current++;
			return linearRecursion(arr, data, current);
		}
		return -1;
	}
	
	// O(n)
	public int linearLoop(String[] arr,String data) {
		for(int index=0;index<arr.length;index++) {
			if(arr[index].compareToIgnoreCase(data)==0)
				return index;
		}
		return -1;
	}
	
	
	// O(logn)
	public int binary(String[] arr,String data,int start,int end) {
		if(end>=start) {
			int mid=start+(end-start)/2;
			if(arr[mid].compareToIgnoreCase(data)==0)
				return mid;
			else if(arr[mid].compareToIgnoreCase(data)<0)// react	spring	-number
				return binary(arr, data, mid+1, end);
			else
				return binary(arr, data, start, mid-1);
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		String[] topSkills= {"spring","react","jpa","rest","junit","mockito","jenkins"};
		
		Search ser=new Search();
//		int res=ser.linearRecursion(topSkills, "rest", 0);
//		System.out.println(res+" position");
		
//		System.out.println(ser.linearRecursion(topSkills, "spring", 0));
//		System.out.println(ser.linearRecursion(topSkills, "jenkins", 0));
//		System.out.println(ser.linearRecursion(topSkills, "rest", 0));
//		System.out.println(ser.linearRecursion(topSkills, "python", 0));
		
//		System.out.println(ser.linearLoop(topSkills, "Spring"));
//		System.out.println(ser.linearLoop(topSkills, "mockito"));
//		System.out.println(ser.linearLoop(topSkills, "jinja"));
		
		Arrays.sort(topSkills);
		System.out.println(Arrays.toString(topSkills));
		
		System.out.println(ser.binary(topSkills, "spring", 0, topSkills.length-1));
		System.out.println(ser.binary(topSkills, "jenkins", 0, topSkills.length-1));
		System.out.println(ser.binary(topSkills, "react", 0, topSkills.length-1));
	}
}
