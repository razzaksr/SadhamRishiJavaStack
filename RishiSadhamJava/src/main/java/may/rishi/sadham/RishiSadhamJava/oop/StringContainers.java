package may.rishi.sadham.RishiSadhamJava.oop;

public class StringContainers {
	public static void main(String[] args) {
		
		//StringBuffer buffer=new StringBuffer(); // not thread safety
		StringBuilder buffer=new StringBuilder(); // thread safety
		
		buffer.append(2.3);buffer.append("Zealous");buffer.append(34);buffer.append(false);
		
		System.out.println(buffer);
	}
}
