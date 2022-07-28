package may.rishi.sadham.RishiSadhamJava.methods;

import may.rishi.sadham.RishiSadhamJava.oop.ShowSome;

public class CallingShowSome extends ShowSome {
	public static void main(String[] args) {
		CallingShowSome show=new CallingShowSome();
		//show.display();
		show.findOrigin("E");
		show.delete("n");
	}
}
