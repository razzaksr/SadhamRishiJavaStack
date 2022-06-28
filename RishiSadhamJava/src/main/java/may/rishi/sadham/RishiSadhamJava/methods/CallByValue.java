package may.rishi.sadham.RishiSadhamJava.methods;

public class CallByValue {
	
	public void happen(String hai){
		// hai is local to happen method
		System.out.println("Received by the method "+hai);// insta
		hai="pepul";
		System.out.println("Changed value by the method is "+hai);// pepul
	}
	
	public static void main(String[] args) {
		String app="insta";// local to main
		System.out.println(app);
		CallByValue value=new CallByValue();
		value.happen(app);// copy app string to happen methods hai arg
		System.out.println(app+" @ main");
	}
}
