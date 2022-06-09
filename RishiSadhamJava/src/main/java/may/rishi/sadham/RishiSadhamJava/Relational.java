package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

/*
 * true/false
 * 
 * > >= <= < == !=
 */

public class Relational {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Enter the required amount ");
//		int amount=scan.nextInt();
//		
//		System.out.println("Denomination status");
//		System.out.println(amount%2000==0);
		
//		int experience=0;
//		System.out.println("Tell us your experience ");
//		experience=scan.nextInt();
//		System.out.println("Do you have chance to become Team Lead "+(experience>=4));
//		System.out.println("Do you have chance to become Consultant "+(experience>6));
		
//		int age=0;
//		System.out.println("Tell us your age ");
//		age=scan.nextInt();
		//System.out.println("Can I have senior citizen concession in the entry fee "+(age>55));
		
		//System.out.println("Can i get the intrest of 7 for my savings "+(age<=50));
		
		char card='\0';
		System.out.println("Tell us type of card you wish ");
		card=scan.next().charAt(0);
		
		System.out.println("Can i get the ATM debit card "+(card!='m'));
		
		scan.close();
	}
}
