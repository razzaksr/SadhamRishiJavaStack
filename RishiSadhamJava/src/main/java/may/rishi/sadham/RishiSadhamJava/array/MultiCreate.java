package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Scanner;

public class MultiCreate {
	
	Scanner user=new Scanner(System.in);
	
	public void addingToMulti(String[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int ind=0;ind<arr[row].length;ind++) {
				System.out.println("Enter the name of the tenant @ floor "+row+" and house "+ind);
				arr[row][ind]=user.nextLine();
			}
			System.out.println();
		}
	}
	
	public void listFromMulti(String[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int ind=0;ind<arr[row].length;ind++) {
				System.out.print(arr[row][ind]+" ");
			}
			System.out.println();
		}
	}
	
	public void pushToJagged(int[][] yet) {
		for(int row=0;row<yet.length;row++) {
			
			System.out.println("Tell us team size for "+row);
			int size=user.nextInt();
			yet[row]=new int[size];
			for(int ind=0;ind<yet[row].length;ind++) {
				System.out.println("Enter the experience of the resource person @ team "+row);
				yet[row][ind]=user.nextInt();
			}
			System.out.println();
		}
	}
	
	public void listFromJagged(int[][] arr) {
		for(int row=0;row<arr.length;row++) {
			for(int ind=0;ind<arr[row].length;ind++) {
				System.out.print(arr[row][ind]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// multi
		String[][] myApartment=new String[3][2];
		// jagged
		int[][] myTeams=new int[4][];
		
		
		MultiCreate object=new MultiCreate();
		
//		object.listFromMulti(myApartment);
//		object.addingToMulti(myApartment);
//		object.listFromMulti(myApartment);
		object.pushToJagged(myTeams);
		object.listFromJagged(myTeams);
	}
}
