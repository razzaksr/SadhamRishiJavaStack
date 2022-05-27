package may.rishi.sadham.RishiSadhamJava;

public class CommandLineArgumentDemo 
{
	public static void main(String[] args) 
	{
		Integer capacity=0;// int capacity;
		
		capacity= Integer.parseInt(args[2]);
		
		System.out.println((capacity*103.5)+" is the amount to be paid");
	}
}
