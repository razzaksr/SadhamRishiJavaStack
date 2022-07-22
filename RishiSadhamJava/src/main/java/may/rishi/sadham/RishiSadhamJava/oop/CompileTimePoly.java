package may.rishi.sadham.RishiSadhamJava.oop;

import java.util.Arrays;

public class CompileTimePoly {
	public static void main(String[] args) {
		Maxi max=new Maxi();
		System.out.println(max);
		max.search("Spring");
		max.search("MySQL");
		max.search("SOAP");
		
		max.order();
		
		System.out.println(max);
		
		max.search("restapi", 0, max.getArrayLength()-1);
		max.search("bootstrap", 0, max.getArrayLength()-1);
		max.search("spring", 0, max.getArrayLength()-1);
		max.search("flask", 0, max.getArrayLength()-1);
	}
	
}

class Maxi{
	private String[] skills= {"Spring","JPA","Bootstrap","React","Mongo","RestAPI","DJango"};
	
	public int getArrayLength() {
		return skills.length;
	}
	
	public void order() {
		Arrays.sort(skills);
	}
	
	public void search(String requirement) {
		for(String ptr:skills) {
			if(ptr.equalsIgnoreCase(requirement)) {
				System.out.println("You are recruited");return;
			}
		}
		System.out.println(requirement+" doesn't match");
	}
	
	public void search(String req,int start,int end) {
		if(start<=end) {
			int mid=start+(end-start)/2;
			
			if(skills[mid].compareToIgnoreCase(req)==0) {
				System.out.println(req+" has matched and recruited");
				return;
			}
			else if(skills[mid].compareToIgnoreCase(req)<0) {
				search(req,mid+1,end);
				return;
			}
			else {
				search(req,start,mid-1);
				return;
			}
		}
		else {
			System.out.println(req+" doesn't match and your are not recruited");
		}
	}

	@Override
	public String toString() {
		return "Maxi [skills=" + Arrays.toString(skills) + "]";
	}
	
	
}