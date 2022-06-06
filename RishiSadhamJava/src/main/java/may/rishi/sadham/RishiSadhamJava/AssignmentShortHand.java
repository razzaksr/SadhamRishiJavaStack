package may.rishi.sadham.RishiSadhamJava;

/*
 * += -= *= /= %=
 * 
 * eg: var1+=var2 >> var1=var1+var2
 * eg: var1*=var2 >> var1=var1*var2
 * eg: var1=var2-var1
 * 
 * 
 */

public class AssignmentShortHand 
{
	public static void main(String[] args) 
	{
		
		System.out.println(4/3);
		System.out.println(4%3);
		
		// swapping
		double varOne=2.3,varTwo=5.6;
		System.out.println("Var One is "+varOne+" Var two is "+varTwo);
		varOne+=varTwo;// 7.9
		varTwo=varOne-varTwo;// 7.9-5.6 >> 2.3
		varOne-=varTwo;// 7.9-2.3 >> 5.6
		System.out.println("Var One is "+varOne+" Var two is "+varTwo);
		
		// by * /
		char charOne='R',charTwo='q';
		System.out.println("Character one is "+charOne+" Character two is "+charTwo);
		charOne*=(char)(charTwo);
		charTwo=(char)(charOne/charTwo);
		charOne/=(char)(charTwo);
		System.out.println("Character one is "+charOne+" Character two is "+charTwo);
		
	}
}
