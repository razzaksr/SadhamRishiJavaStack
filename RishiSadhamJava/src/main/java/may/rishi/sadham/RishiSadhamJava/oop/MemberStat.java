package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

// member class/ inner class as a static

public class MemberStat {
	public static void main(String[] args) {
		WestCoast.view();
		WestCoast.Rishi rish=new WestCoast.Rishi();
		rish.makeOrder();
		WestCoast.view();
	}
}

class WestCoast{
	static String[][] crew= {{"Bejoy","Dilli","Kamatchi"},{"Vikram","Amar"},{"Dilli","Rolex","Adaikalam","Anbu"}};
	
	public static void view() {
		System.out.println("Lokesh Cinematic Universe");
		for(int pos=0;pos<crew.length;pos++) {
			System.out.println(Arrays.toString(crew[pos]));
		}
	}
	
	static class Rishi{
		
		public void makeOrder() {
			for(int pos=0;pos<crew.length;pos++) {
				Arrays.sort(crew[pos]);
			}
		}
	}
}