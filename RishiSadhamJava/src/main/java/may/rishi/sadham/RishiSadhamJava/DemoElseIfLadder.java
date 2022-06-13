package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoElseIfLadder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String technology="";
		
		System.out.println("Tell us technology u knew ");
		technology=scan.next();
		
		if(technology.equalsIgnoreCase("react")){
			System.out.println("UI Developer jobs available");
		}
		else if(technology.equalsIgnoreCase("java")){
			System.out.println("Backend Developer jobs available");
		}
		else if(technology.equalsIgnoreCase("selenium")){
			System.out.println("Quality Engineer jobs available");
		}
		else {
			System.out.println("No jobs matching for "+technology);
		}
		
		scan.close();
	}
}
