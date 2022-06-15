package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoWhile {
	public static void main(String[] args) {
//		int alpha=21;// init
//		while(alpha<=25)//cond
//		{
//			System.out.println("I am a legend");
//			alpha++;// iter
//		}
		
//		char carter='Z';
//		
//		while(carter>='A'){
//			System.out.println(carter);
//			carter-=2;
//		}
		
		Scanner scan=new Scanner(System.in);
		
		int amt=0,available=50,count=0,payable=0,invoice=0;
		
		// 10
		while(available>0)// whether counter is open for ticket
		{
			System.out.println("Tell us how many tickets you want ");
			count=scan.nextInt();//20
			
			if(available>=count)// check against user required count
			{
				payable=count*210;// user has to pay
				System.out.println("Enter the amount "+payable);
				amt=scan.nextInt();
				if(amt>=payable) {
					available-=count;// iter
					System.out.println(count+" no of tickets issued enjoy the movie");
					invoice++;
				}
				else {
					System.out.println("Insufficient amount to watch movie");
				}
			}
			else {
				System.out.println("We only have "+available);
			}
		}
		
		System.out.println(invoice+" no of persons bought the tickets");
		
//		int amt=0,seats=15;
//		while(seats>0){
//			
//			System.out.println("Enter the amount ");
//			amt=scan.nextInt();// 300
//			
//			if(amt>=520){
//				System.out.println("You can travel to chennai in the YBM travels @ "+seats);
//				seats--;
//			}
//			else {
//				System.out.println("Insufficient amount to travel");
//			}
//			//seats--	
//		}
		
		scan.close();
	}
}
