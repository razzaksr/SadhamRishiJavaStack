package may.rishi.sadham.RishiSadhamJava;

/*
 * BUDMAS/BODMAS
 * bracket
 * unary
 * division-multiplication
 * add-sub
 */

public class ExpressionsOne {
	public static void main(String[] args) {
		int steve=102, tony=45, wanda=0;
		
		//      102 + 44 - 103
		//wanda=(steve++)+(--tony)-(steve--);
		
		// 		44+102*45-101
		//wanda=(--tony)+(steve--)*(++tony)-(steve++);
		
		//		102/46*100+46
		wanda=(steve--)/(++tony)*(--steve)+(tony--);
		
		System.out.println(wanda);
		
	}
}
