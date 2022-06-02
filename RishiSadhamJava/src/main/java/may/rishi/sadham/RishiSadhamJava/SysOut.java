package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

/*
 * class System
 * {
 * static PrintStream out;
 * static PrintStream err;
 * static InputStream in;
 * }
 * 
 * class PrintStream
 * {
 * println()
 * printf()
 * print()
 * }
 * 
 * System.out.println()
 */

public class SysOut 
{
	public static void main(String[] args) 
	{
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Calling method inside an sysout");
		// how we can call method inside an sysout
		//System.out.println(scanObj.nextLine());
		
		// static and non static call
//		Alpha al=new Alpha();
//		al.discovery();
//		Alpha.disclose();
		
		// how System.out.println formed
		Delta.hey=9.1;
		Delta.ap.discovery();// Class.object.method
		
		scanObj.close();
	}
}

class Delta
{
	int cosmo;
	static double hey;
	static Alpha ap=new Alpha();
}

class Alpha
{
	public static void disclose()
	{
		System.out.println("Dont disclose yourself to anyone in sudden");
	}
	public void discovery()
	{
		System.out.println("Discover yourself");
	}
}


