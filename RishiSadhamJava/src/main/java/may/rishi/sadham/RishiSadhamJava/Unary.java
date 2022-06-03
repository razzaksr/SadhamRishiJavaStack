package may.rishi.sadham.RishiSadhamJava;

/*
 * ++ --
 * 
 * ++ increment one unit
 * -- decrement one unit
 * 
 * pre	: SYMBOLvar/obj	>> getting the operation result same spot 
 * post	: var/objSYMBOL	>> getting the operation result @ next usage
 * 
 */

public class Unary {
	public static void main(String[] args) {
		Short hi=98;
		System.out.println(hi);// 98
		System.out.println(hi++);//98
		//System.out.println(hi+1);//100
		System.out.println(hi);//99
		System.out.println(++hi);
		
		char wind='A';// 65
		System.out.println(wind);
		System.out.println(--wind);
		System.out.println(wind);
		System.out.println(wind--);
		System.out.println(--wind);
	}
}
