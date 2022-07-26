package may.rishi.sadham.RishiSadhamJava.oop;

public class ClassVsInterface implements Max{
	public static void main(String[] args) {
		Quick q=new Quick();
		//q.name="rishi";
		q.setName("Rishi");
		System.out.println(q.name);
		
		//Max max=new Max();
		ClassVsInterface vs=new ClassVsInterface();
		//vs.fico=7.8;// final value/ constant
		System.out.println(vs.fico);
	}
	
}

class Quick{
	String name;// default initialization is null
	
	// non abstract method
	public void setName(String name) {
		this.name=name;
	}
}

interface Max{
	double fico=0;// mandate to initialize the members
	// abstract method
	
}