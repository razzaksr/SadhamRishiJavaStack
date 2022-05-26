package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DiscussOnTypes 
{
	public static void main(String[] args) 
	{
		// declaration
//		String profileName,skill;int experience;
//		double currentCtc,expectedCtc;
		
		// default value for Class object is null
		// default value for int 0 double 0............
		
		// initialization
		String profileName="",skill="";int experience=0;
		double currentCtc=0.0,expectedCtc=0.0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us resource person name ");
		profileName=scan.nextLine();
		System.out.println("Tell us resource person skill ");
		skill=scan.nextLine();
		System.out.println("Tell us resource person experience ");
		experience=scan.nextInt();
		System.out.println("Current CTC ");
		currentCtc=scan.nextDouble();
		System.out.println("Excepected annual ctc ");
		expectedCtc=scan.nextDouble();
		
		System.out.println("Thanks for registering the interview "+profileName+" has experience of "+experience+" in the technology "+skill+" with current ctc of "+currentCtc);
		
		scan.close();
		
	}
}
