package may.rishi.sadham.RishiSadhamJava.oop;

public class DemoFin extends Quiz{//extends Ginger{
	
	public void sortOut() {
		System.out.println("Demo final modfier");
	}
	
	// final method cannot be overriden
//	public void freakOut() {
//		System.out.println("Overriden");
//	}
	
	public static void main(String[] args) {
		//Ginger gin=new Ginger();gin.hello();
		DemoFin fin=new DemoFin();
		fin.sortOut();
		fin.freakOut();
	}
}

final class Ginger{
	public void hello() {
		System.out.println("Simply method");
	}
}

class Quiz{
	public void sortOut() {
		System.out.println("Sorting out user stories");
	}
	public final void freakOut() {
		System.out.println("Freaking out when you heard Full stack developer gets 35LPA in UK");
	}
}