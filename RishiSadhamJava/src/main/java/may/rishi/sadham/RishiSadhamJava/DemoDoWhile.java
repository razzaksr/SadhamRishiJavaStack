package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoDoWhile {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int amt=0,seats=-1;
		do{
			
			System.out.println("Enter the amount ");
			amt=scan.nextInt();// 300
			
			if(amt>=520){
				System.out.println("You can travel to chennai in the YBM travels @ "+seats);
				seats--;
			}
			else {
				System.out.println("Insufficient amount to travel");
			}
			//seats--	
		}while(seats>0);
		
		scan.close();
	}
}
