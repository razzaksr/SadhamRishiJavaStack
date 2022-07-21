package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class Anonymous {
	public static void main(String[] args) {
		
		// object re-usability
//		Cheetah chee=new Cheetah();
//		chee.view();
//		chee.swapRows(1, 2);
//		chee.view();
		
		// anonymous 
		new Cheetah().view();
//		new Cheetah().swapRows(0,2);
//		new Cheetah().view();
	}
}


class Cheetah{
	int[][] finale= {{90,56,33,18},{7,4,5},{1,5,0,4,65,2,66,43,56}};
	
	public void swapRows(int user1,int user2) {
		if(user1<finale.length&&user2<finale.length) {
			int[] tmp= {};
			tmp=finale[user1];
			finale[user1]=finale[user2];
			finale[user2]=tmp;
		}
	}
	
	public void view() {
		for(int row=0;row<finale.length;row++) {
			System.out.println(Arrays.toString(finale[row]));
		}
	}
}
