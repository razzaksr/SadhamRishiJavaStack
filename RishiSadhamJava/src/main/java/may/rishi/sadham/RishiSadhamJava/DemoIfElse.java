package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoIfElse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float time=0;
		
		System.out.println("Tell us desired travel time ");
		time=scan.nextFloat();
		
		if(time>=10.11F&&time<13.45F)
		{
			System.out.println("Air India Executive class available");
		}
		else
		{
			System.out.println("Indigo Business class available @ 20.45pm");
		}
		
		scan.close();
	}
}
