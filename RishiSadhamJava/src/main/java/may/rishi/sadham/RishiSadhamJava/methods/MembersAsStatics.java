package may.rishi.sadham.RishiSadhamJava.methods;

/*
 * the static members of the class has almost only one copy to all the objects
 * 
 * the static members can be called by Classname itself
 * 		eg:
 * 			Classname.staticMember
 * 
 * the static method cannot have "this" keyword in the body
 * 
 * objects are required in the static block when you try to call any non static member
 */

public class MembersAsStatics {
	public static void main(String[] args) {
		Finale fin1=new Finale();
		Finale fin2=new Finale();
		
		fin1.alpha=67;fin1.gamma=56;
		fin2.alpha=122;fin2.gamma=44;
		
		fin1.perform();
		fin2.perform();
		
		//fin1.myOrg="Infosys";
		Finale.myOrg="Infosys";
		
//		System.out.println(fin1.myOrg+" is org of fin1");
//		System.out.println(fin2.myOrg+" is org of fin2");
		
		System.out.println(Finale.myOrg+" is org of fin1");
		System.out.println(Finale.myOrg+" is org of fin2");
		
//		fin2.myOrg="Cognizant";
		Finale.myOrg="Cognizant";
		
//		System.out.println(fin1.myOrg+" is org of fin1");
//		System.out.println(fin2.myOrg+" is org of fin2");
		
		System.out.println(Finale.myOrg+" is org of fin1");
		System.out.println(Finale.myOrg+" is org of fin2");
		
		
		Finale.due();
		
		Finale.denmark(fin1);
		Finale.denmark(fin2);
	}
}

class Finale{
	int alpha,gamma;
	
	public void perform() {
		System.out.println(this.alpha^this.gamma);
	}
	
	static String myOrg;
	
	public static void due() {
		Finale fin=new Finale();fin.alpha=110;fin.gamma=220;
		System.out.println(fin.alpha|fin.gamma);
	}
	
	public static void denmark(Finale object) {
		System.out.println(object.alpha|object.gamma);
	}
}