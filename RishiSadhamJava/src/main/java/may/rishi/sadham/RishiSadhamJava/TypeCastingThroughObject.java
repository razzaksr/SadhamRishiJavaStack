package may.rishi.sadham.RishiSadhamJava;

public class TypeCastingThroughObject 
{
	public static void main(String[] args) 
	{
		Integer north=120;
		
		Object west=north;// automatic casting
		
		System.out.println(west);
		
		Object east=8.9F;
		
		Float south=(Float) east;
		
		System.out.println(south);
	}
}
