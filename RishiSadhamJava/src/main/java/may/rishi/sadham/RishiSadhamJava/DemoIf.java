package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoIf {
	public static void main(String[] args) {
		double ctc=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us your annual income ");
		ctc=scan.nextDouble();
//		
//		if(ctc>=3.0)
//		{
//			ctc-=(ctc*10)/100;//ctc-=(ctc*0.100);
//			System.out.println("10 percent TDS deducted");
//		}
//		
//		System.out.println("Your take home is "+ctc);
		
		int noOfProjects=0;
		
		
		
		System.out.println("Tell us no of projects you have successfully contributed ");
		noOfProjects=scan.nextInt();
		
		if(noOfProjects>=5)
		{
			System.out.println("You will get 20percent of hike in your ctc");
			ctc+=(ctc*0.200);
		}
		
		System.out.println("Thanks for participate in apprisal meeting your ctc "+ctc);
		
		scan.close();
	}
}
