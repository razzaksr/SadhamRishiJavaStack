package may.rishi.sadham.RishiSadhamJava.oop;

/*
 * String: literal and non literal support
 * Immutable class
 * 
 * concat
 * trim
 * charAt
 * substring
 * equals
 * equalsIgnoreCase
 * compareTo
 * compareToIgnoreCase
 * getBytes
 * contains
 * replace
 * startsWith
 * endsWith
 * toUpperCase
 * toLowerCase
 * 
 */

public class StringDecode {
	public static void main(String[] args) {
		String resource1="Rishi";// object>> literal
		String resource2=new String("Sadham");// object>> non literal
		
		System.out.println(resource1.length());
		System.out.println(resource2.charAt(2));
		
		System.out.println(resource2.substring(2,5));
		
		System.out.println(resource1+" "+resource1.getBytes());
		
		//System.out.println(resource2.concat(resource1));
		
		System.out.println(resource2+resource1);
		
		System.out.println(resource2=="Sadham");
		
		System.out.println(resource2.equals("sadham"));
		
		System.out.println(resource2.equalsIgnoreCase("saDHam"));
		
		System.out.println(resource1=="Rishi");
		
		System.out.println(resource1.compareTo("rishi"));
		System.out.println(resource1.compareToIgnoreCase("rishi"));
		
		resource2="      Today String demonstration gets over    ";
		System.out.println(resource2.length());
		//resource2.trim();// immutable
		resource2=resource2.trim();
		System.out.println(resource2.length());
		
		resource1=resource1.toLowerCase();
		System.out.println(resource1);
		
		System.out.println(resource2.contains("et"));
		
		System.out.println(resource2.replace("String", "Java"));// immutable
		
		System.out.println(resource2);
	}
}
