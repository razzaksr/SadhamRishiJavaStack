package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Alpha
 * 	|
 * Beta
 * 	|
 * Cosmo
 */

public class MultLevel {
	public static void main(String[] args) {
		North north=new North();
		north.insert();
		north.list();
		north.update();
		north.list();
	}
}

class West{
	String[] mark=new String[10];
	public void list() {
		System.out.println(Arrays.toString(mark));
	}
}

// single
class East extends West{
	Scanner scan=new Scanner(System.in);
	public void insert() {
		for(int pos=0;pos<mark.length;pos++) {
			System.out.println("Known skill set of yours ");
			mark[pos]=scan.nextLine();
		}
	}
}

class North extends East{
	public void update() {
		System.out.println("Tell us which skill you gonna update ");
		String what=scan.nextLine();
		if(Arrays.toString(mark).contains(what)) {
			for(int pos=0;pos<mark.length;pos++) {
				if(mark[pos].equalsIgnoreCase(what)) {
					System.out.println("Tell us skill you replace ");
					mark[pos]=scan.nextLine();
					break;
				}
			}
		}
		else {
			System.out.println(what+" not in your skill set");
		}
	}
}