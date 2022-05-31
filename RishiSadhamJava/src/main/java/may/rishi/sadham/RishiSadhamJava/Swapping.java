package may.rishi.sadham.RishiSadhamJava;

public class Swapping 
{
	public static void main(String[] args) 
	{
		// using third variable/object
		int dataOne=90,dataTwo=33,dataThree=0;
		System.out.println("Data One is "+dataOne+" Data two is "+dataTwo);
		dataThree=dataOne;
		dataOne=dataTwo;
		dataTwo=dataThree;
		System.out.println("Data One is "+dataOne+" Data two is "+dataTwo);
		
		// using arithmetic + -
		double varOne=2.3,varTwo=5.6;
		System.out.println("Var One is "+varOne+" Var two is "+varTwo);
		varOne=varOne+varTwo;// 7.9
		varTwo=varOne-varTwo;// 7.9-5.6 >> 2.3
		varOne=varOne-varTwo;// 7.9-2.3 >> 5.6
		System.out.println("Var One is "+varOne+" Var two is "+varTwo);
		
		// using arithmetic * /
		char charOne='R',charTwo='q';
		System.out.println("Character one is "+charOne+" Character two is "+charTwo);
		charOne=(char)(charOne*charTwo);
		charTwo=(char)(charOne/charTwo);
		charOne=(char)(charOne/charTwo);
		System.out.println("Character one is "+charOne+" Character two is "+charTwo);
		
	}
}
