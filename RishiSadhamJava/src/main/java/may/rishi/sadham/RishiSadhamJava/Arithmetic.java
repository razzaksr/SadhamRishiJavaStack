package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

/*
 * 	+ - * / %
 * 
 *  
 */

public class Arithmetic 
{
	public static void main(String[] args) 
	{
		System.out.println("Billing App");
		Scanner scan=new Scanner(System.in);
		Integer qty=0,price=0;Double payable=0.0;
		
		System.out.println("Enter the product price ");
		price=scan.nextInt();
		System.out.println("Enter the product quantity ");
		qty=scan.nextInt();
		payable=(double)(price*qty);
		System.out.println("Without GST "+payable);
		//payable=payable+(payable*3)/100;
		payable=payable+(payable*0.03);
		System.out.println("With GST "+payable);
		
		scan.close();
	}
}
