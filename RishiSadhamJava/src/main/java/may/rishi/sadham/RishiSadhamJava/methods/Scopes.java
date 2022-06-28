package may.rishi.sadham.RishiSadhamJava.methods;

/*
 * global/ class level members are no need to initialize by default
 * local members has to be initialized
 * 
 * 
 * non static class members will have individual copy in every objects which created for the class
 * eg:
 * 	Flipkart >> class
 * 	  non static members of flipkart
 * 		myKart
 * 		myWishlist
 * 
 * 	razak>> object of flipkart
 * 		myKart, myWishlist
 * 	sadham>> object of flipkart
 * 		myKart,myWishlist
 */

public class Scopes {
	
	String yet;// global or Scopes class level member
	
	public void halloween() {
		System.out.println("Happy Halloween");
		System.out.println(this.yet+" @ halloween party");
	}
	
	public static void main(String[] args) {
		Scopes west=new Scopes();
		west.yet="Rishi";
		System.out.println(west.yet);
		west.halloween();
		
		
		Scopes apes=new Scopes();
		apes.yet="Zealous";
		System.out.println(apes.yet);
		apes.halloween();
	}
}
