package may.rishi.sadham.RishiSadhamJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiUpdate {
	
	Scanner scan=new Scanner(System.in);
	
	public void byPosition(String[][] arr) {
		System.out.println("Tell us row ");
		int row=scan.nextInt();
		System.out.println("Tell us col ");
		int col=scan.nextInt();
		
		if(row<arr.length&&col<arr[row].length) {
			System.out.println("Tell us the new actor to be replacing "+arr[row][col]);
			arr[row][col]=scan.next();
			System.out.println(arr[row][col]+" is the new actor to be casted");
		}
		else {
			System.out.println("No cast actor found ");
		}
	}
	
	public void traverse(String[][] arr) {
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}
	
	public void byCondition(String[][] arr) {
		
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col].endsWith("a")||
						arr[row][col].endsWith("e")||
						arr[row][col].endsWith("o")||
						arr[row][col].endsWith("i")||
						arr[row][col].endsWith("u")) {
					System.out.println("Please cast new actor instead of "+arr[row][col]);
					arr[row][col]=scan.next();
					System.out.println(arr[row][col]+" has replaced");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String[][] cast= {{"Evans","Jeremy","Johanson"},
				{"Downey","Boseman","Holland","Pratt"},
				{"Ruffallo","Hemsworth"}};
		
		MultiUpdate up=new MultiUpdate();
		//up.byPosition(cast);
		up.traverse(cast);
		up.byCondition(cast);
		up.traverse(cast);
	}
}
