package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class Currency 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int requiredCash=0;
		
		System.out.println("Enter the required cash ");
		requiredCash=scan.nextInt();
		
		System.out.println(requiredCash/2000);
		
		scan.close();
	}
}
