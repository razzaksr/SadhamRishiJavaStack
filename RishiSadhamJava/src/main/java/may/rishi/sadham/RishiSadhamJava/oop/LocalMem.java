package may.rishi.sadham.RishiSadhamJava.oop;

// class as local member of method

public class LocalMem {
	public static void main(String[] args) {
		EastCoast east=new EastCoast();
		east.reactSome(2.3);
		east.reactSome(92.5);
		east.reactSome(89.3);
	}
}

class EastCoast{
	double[][] mark= {{9.1,3.9,15.6,92.5},{3.0,0.004,7.5},{2.3,56.9,3.4,88.1,10.2,4.4}};
	
	public void reactSome(double data) {
		int hey=12;
		
		class Kurla{
			public void linear(double user) {
				for(int row=0;row<mark.length;row++) {
					for(int col=0;col<mark[row].length;col++) {
						if(user==mark[row][col]) {
							System.out.println(user+" found @ row "+row+" and "+col);
							return;
						}
					}
				}
				System.out.println(user+" doesn't match anywhere");
			}
		}
		
		System.out.println(mark.length+" @ react");
		System.out.println(hey+" @ react");
		
		Kurla kur=new Kurla();
		kur.linear(data);
	}
}