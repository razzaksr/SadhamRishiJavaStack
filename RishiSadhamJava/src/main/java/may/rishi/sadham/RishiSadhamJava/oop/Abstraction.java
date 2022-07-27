package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class Abstraction implements Cast{
	
	public void hai() {
		System.out.println("This is abstraction class member");
	}
	
	public static void main(String[] args) {
		Cast ct=new Abstraction();// factory pattern
		//ct.hai();
		
		ct.list();
	}

	@Override
	public void list() {
		for(int row=0;row<myfav.length;row++) {
			System.out.println(Arrays.toString(myfav[row]));
		}
	}
}

interface Cast{
	String[][] myfav= {{"DJango","Flask"},{"Spring","JPA","Rest"},{"Mongodb","Express","React","Node","Javascript"}};
	// abstract
	public void list();
}

class Windy{
	String[][] myfav= {{"DJango","Flask"},{"Spring","JPA","Rest"},{"Mongodb","Express","React","Node","Javascript"}};
	// non abstract
	public void list() {
		for(int row=0;row<myfav.length;row++) {
			System.out.println(Arrays.toString(myfav[row]));
		}
	}
}