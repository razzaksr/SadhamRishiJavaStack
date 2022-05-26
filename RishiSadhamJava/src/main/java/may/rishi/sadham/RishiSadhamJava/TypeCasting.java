package may.rishi.sadham.RishiSadhamJava;

/*
 * Type Conversion:
 * casting:
 * 	between data types:
 * 			type1 var1; type2 var2;
 * 			a.var1=(type1)var2
 * 			b.var2=(type2)var1
 * 	between Object class and any class
 * parsing:
 */

public class TypeCasting 
{
	public static void main(String[] args) 
	{
		double liters=34.7; int fuel=0;
		
		fuel=(int)liters;// manually casted
		
		System.out.println("My tank capacity "+fuel);
		
		
		int hai=90; short yet=0; char data='\0';// char null
		
		yet=(short)hai;// manually casted
		
		System.out.println("Casted short value "+yet);
		
		data=(char) hai;// manually casted
		
		System.out.println("Casted char value "+data);
		
		char mySymbol='R';int west=0; short east=0;
		
		west=mySymbol;
		
		System.out.println("Casted int value "+west);
		
		east=(short) mySymbol;// manually casted
		
		System.out.println("Casted short value "+east);
		
		short varOne=112;int varTwo=0;
		
		varTwo=varOne;
		
		System.out.println("Casted int value "+varTwo);
	}
}
