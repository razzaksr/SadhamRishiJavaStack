package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class PrepareChart {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int amt=0;String chart="";
		
		for(int row=1;row<=5;row++) {
			for(int seat=1;seat<=4;seat++){
				System.out.println("Enter the amount ");
				amt=scan.nextInt();
				
				if(amt>=630) {
					System.out.println("Your seat is booked @ "+row+" and "+seat);
					chart+="$";
				}
				else {
					System.out.println("Insufficient to travel");
					chart+="@";
				}
				// leave the space in the chart after the 2nd seat
				if(seat==2) {
					chart+=" ";
				}
			}
			chart+="\n";
		}
		
		System.out.println(chart);
		
		scan.close();
	}
}
