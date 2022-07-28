package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class ShowSome {
	private String[] names= {"Holland","Ruffallo","Evans","Hiddleston",
			"Downey","Pratt","Tawakii","Johanson","Hemsworth"};
	
	
	//default
	void display() {
		System.out.println(Arrays.toString(names));
	}
	
	public void findOrigin(String phrase) {
		for(int index=0;index<names.length;index++) {
			if(names[index].startsWith(phrase)) {
				System.out.println(names[index]);
			}
		}
	}
	
	protected void delete(String phrase) {
		for(int index=0;index<names.length;index++) {
			if(names[index].endsWith(phrase)) {
				names[index]=null;
			}
		}
	}
}
