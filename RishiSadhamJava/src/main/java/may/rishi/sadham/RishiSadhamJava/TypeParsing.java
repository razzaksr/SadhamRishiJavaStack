package may.rishi.sadham.RishiSadhamJava;

/*
 * TypeConversion:
 * 	casting
 * 	parsing: String to any types using wrapper class method
 * 			var/obj=WrapperClass.parseType(String)
 * 					Integer.parseInt(String)
 * 					Double.parseDouble(String)
 * 					Float.parseFloat(String)
 * 					Long.parseLong(String)
 * 					Short.parseShort(String)
 * 					Byte.parseByte(String)
 * 					Boolean.parseBoolean(String);
 * 					
 * 	
 */

public class TypeParsing 
{
	// [] >> array contains multiple values in each kept by its position which is starts with 0
	// TypeParsing.main
	public static void main(String[] args)// command line argument 
	{
		String original="false";// "12" "8.9" "true"
		boolean myBool=Boolean.parseBoolean(original);
		System.out.println(myBool);
		
		original="3.4F";
		float myFractional=Float.parseFloat(original);
		System.out.println(original+2);// 3.4F2
		System.out.println(myFractional+2);// 5.4
		
		
	}
}
