package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		String productName="";Double price=0.0;Short quantity=0;String mode="";
		
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Tell us product to purchase ");
		productName=scanObj.nextLine();
		System.out.println("Tell us mode of purchase ");
		mode=scanObj.nextLine();
		System.out.println("Tell us price of the product ");
		price=scanObj.nextDouble();
		System.out.println("Tell us quantity ");
		quantity=scanObj.nextShort();
		
		
		System.out.println("Thanks for ordering "+productName+" of quantity's "+quantity+" for the price of "+price+" in the mode "+mode);
		
		
		scanObj.close();
	}
}
