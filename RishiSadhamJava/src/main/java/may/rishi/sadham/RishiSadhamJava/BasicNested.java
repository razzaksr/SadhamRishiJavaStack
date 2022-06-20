package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class BasicNested {
	public static void main(String[] args) {
//		for(int tab=1;tab<=5;tab++) {
//			for(int myNum=1;myNum<=10;myNum++) {
//				System.out.println(myNum+" X "+tab+" = "+(myNum*tab));
//			}
//		}
		
		int amt=0;
		Scanner scan=new Scanner(System.in);
		
		for(int bus=1;bus<=4;bus++) {
			System.out.println("Bus "+bus+" entered in the bus bay");
			for(int seat=1;seat<=10;seat++) {
				System.out.println("Enter the amount ");
				amt=scan.nextInt();
				if(amt>=380) {
					System.out.println("Seat booked @ "+seat);
				}
				else {
					System.out.println("Cant book due to insufficient amount");
				}
			}
		}
		
		scan.close();
		
	}
}
