package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Hybrid extends Archery implements Cupcake{
	public static void main(String[] args) {
		Hybrid hyb=new Hybrid();
		hyb.insert();
		hyb.list();
		System.out.println(hyb.read(12));
		int[] rec=hyb.update(4.5);
		System.out.println(Arrays.toString(rec));
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
		System.out.println("Tell us no of items you wish to add ");
		int size=scan.nextInt();
		
		shine=new double[size];
		
		for(int index=0;index<shine.length;index++) {
			System.out.println("Enter the value @ "+index);
			shine[index]=scan.nextDouble();
		}
		System.out.println("Values are inserted into a array");
	}

	@Override
	public int[] update(double data) {
		// TODO Auto-generated method stub
		int[] tmp=new int[shine.length];
		for(int index=0, pos=0;index<shine.length;index++) {
			if(shine[index]>=data) {
				shine[index]-=(shine[index]*0.500);
				tmp[pos]=index;pos++;
			}
		}
		return tmp;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Available items in array");
		System.out.println(Arrays.toString(shine));
	}

	@Override
	public double read(int index) {
		// TODO Auto-generated method stub
		if(index>-1&&index<shine.length) {
			return shine[index];
		}
		else {
			return 0;
		}
	}
}

class Archery{
	double[] shine;
}

interface Cupcake extends Kitkat{
	public void list();
	public double read(int index);
}

interface Kitkat{
	Scanner scan=new Scanner(System.in);
	public void insert();
	public int[] update(double data);
}