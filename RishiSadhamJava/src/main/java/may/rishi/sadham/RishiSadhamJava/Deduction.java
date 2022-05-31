package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class Deduction 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int commercial=0,days=0;float tds=0.0F,takeHome=0.0F;
		
		System.out.println("Tell us your commercial/day ");
		commercial=scan.nextInt();
		System.out.println("No of days ");
		days=scan.nextInt();
		
		takeHome=commercial*days;
		System.out.println("Without TDS "+takeHome);
		
		System.out.println("TDS percentage ");
		tds=scan.nextFloat();
		
		takeHome=takeHome-(takeHome*tds)/100;
		System.out.println(takeHome);
		
		
		scan.close();
	}
}
