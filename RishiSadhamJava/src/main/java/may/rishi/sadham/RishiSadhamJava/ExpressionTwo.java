package may.rishi.sadham.RishiSadhamJava;

public class ExpressionTwo {
	public static void main(String[] args) {
		int west='E', east=95, south=0;
		
		// 		138/96*138-32
		//south=(west*=2)/(++east)*(west--)-(east/=3);
		
		//		1-19/2*20
		south=(east%=2)-(west-=50)/(++east)*(++west);
		
		south=(west--)/(east/=3)+(west+=10)-(east-=20);
		south=(east+=50)*(west/=4)+(east*=2)+(west*='A');
		
		
		System.out.println(south);
	}
}
