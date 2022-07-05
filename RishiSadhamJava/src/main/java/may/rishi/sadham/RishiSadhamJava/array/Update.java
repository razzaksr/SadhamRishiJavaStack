package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Update {
	
	Scanner scan=new Scanner(System.in);
	
	public void byCondition(int[] heap,int pos,int consider) {
		if(pos<heap.length) {
			
			if(heap[pos]<=consider) {
				heap[pos]+=(heap[pos]*0.500);
			}
			
			pos++;
			byCondition(heap, pos, consider);
		}
		return;
	}
	
	public void changeSome(int[] quick,int index) {
		
		if(index<quick.length) {
			System.out.println("Enter the new value @ "+index);
			quick[index]=scan.nextInt();
			index++;
			changeSome(quick, index);
		}
		return;
	}
	
	public static void main(String[] args) {
		int[] alpha= {78,3,34,90,56,78,9,12,43,76,10,4,24};
		System.out.println(Arrays.toString(alpha));
		
		// by pos/ind
//		alpha[3]=10;
//		
		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("Tell us position to update ");
//		int pos=scan.nextInt();
//		System.out.println("Tell us value to replace/ update in the position "+pos);
//		int data=scan.nextInt();
//		
//		alpha[pos]=data;
		
		Update up=new Update();
		// updating all position values
//		up.changeSome(alpha, 0);
		
		// update based on the condition
		up.byCondition(alpha, 0, 30);
		
		System.out.println(Arrays.toString(alpha));
		
		
		scan.close();
	}
}
