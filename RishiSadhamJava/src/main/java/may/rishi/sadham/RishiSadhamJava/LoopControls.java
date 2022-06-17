package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

// continue, break

public class LoopControls {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int age=0;
		
//		for(int entry=1;entry<=10;entry++) {
//			System.out.println("Enter the age ");
//			age=scan.nextInt();
//			if(age>=18) {
//				System.out.println("You are welcome to the horror show");
//				
//			}
//			else {
//				System.out.println("Sorry we cannot let you IN");
//				//break;
//			}
//		}
		int entry=1;
		while(entry<=10) {
			System.out.println("Enter the age ");
			age=scan.nextInt();
			if(age>=18) {
				System.out.println("You are welcome to the horror show");
				
			}
			else {
				System.out.println("Sorry we cannot let you IN");
				//break;
				continue;
			}
			entry++;
		}
		
		scan.close();
	}
}
