package may.rishi.sadham.RishiSadhamJava.methods;

/*
 * object has to be created to the CLASS, from where you want to access members(methods,var)
 * 
 * object for the class is required when we try to call non static member from the static block
 * 
 * a static var/method can be called by anyone(static block/non static block) 
 	doesn't require an object
 	syntax:
 		Classname.staticMembers
 */

public class BasicMethods {
	public void hai() {
		System.out.println("Hello im new to you!");
	}
	public static void main(String[] args) {
		System.out.println("Execution order");
		BasicMethods basic=new BasicMethods();
		basic.hai();
		MyRule rule=new MyRule();
		rule.myNorms="Quality is ultimate";
		System.out.println(rule.myNorms);
		//rule.natasha();
		MyRule.natasha();
		rule.steveHarvy();
	}
}


class MyRule{
	String myNorms;// global/ MyRule class member
	public static void natasha() {
		System.out.println("Members are properties of the class");
	}
	public void steveHarvy(){
		System.out.println("Nobody cares you morethan yourself");
	}
}