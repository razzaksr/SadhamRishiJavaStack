package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

/*
 * 
 true/false
 
 rel&&rel	
 rel||rel
 
 
 */

public class Logical {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Enter the required amount ");
//		int amount=scan.nextInt();
//		
//		System.out.println(amount%500==0||amount%200==0);
		
		double salary=0;int cibil=0;boolean isPanAvailable=false;
		
		System.out.println("Tell us salary ");
		salary=scan.nextDouble();
		
		System.out.println("Tell us cibil score ");
		cibil=scan.nextInt();
		
		System.out.println("Tell us PAN is available ");
		isPanAvailable=scan.nextBoolean();
		
		System.out.println("Are you eligible for 1Lack Personal Loan "+(cibil>=700&&salary>=3.1&&isPanAvailable==true));
		
		
		scan.close();
	}
}
