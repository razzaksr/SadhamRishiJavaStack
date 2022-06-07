package may.rishi.sadham.RishiSadhamJava;

/* 
& | ^ >> <<
int short char byte boolean

1024 512 256 128 64 32 16 8 4 2 1
   0   0   0   0  1  0  0 1 1 0 0	-	76 - dataOne
   
   0   0   0   0  0  0  0 1 0 1 1	-	11 - dataTwo
   
   0   0   0   0  1  0  0 0 1 1 1	-	71 - dataOne
   
   0   0   0   0  1  0  0 1 1 0 0	-	76 - dataTwo
   0   0   0   0  0  0  0 1 0 1 1	-	11 - dataOne
   
   
   0   0   0   0  1  1  0 1 1 1 0	-	110 - natasha
   0   0   0   0  0  0  0 1 0 1 0	-	 10
   0   0   0   0  0  0  0 1 0 1 0	-	 10	-	&	1,1 >>1
   
   0   0   0   0  0  1  0 1 0 1 1	-	43 - clint
   0   0   0   0  1  0  0 0 0 1 0	-	66 - B
   0   0   0   0  1  1  0 1 0 1 1	-	107- |		1,0>>1 1,1>>1 0,1>>1 
   
   0   0   1   0  0  1  0 1 0 1 0	-	298 - fury
   0   0   0   0  1  1  1 1 0 1 0	-	122	- z
   0   0   1   0  1  0  1 0 0 0 0	-	336 - ^		0,1>>1 1,0>>1
   
   

*/
public class Bitwise {
	public static void main(String[] args) {
		char natasha=110;int clint=43;short fury=298;
		
		System.out.println(natasha&10);
		
		System.out.println(clint|'B');
		
		System.out.println(fury^'z');
		
		byte dataOne=76,dataTwo=11;
		System.out.println(dataOne+" is first element and "+dataTwo+" is second element");
		dataOne^=dataTwo;
		dataTwo^=dataOne;// dataTwo=dataOne^dataTwo
		dataOne^=dataTwo;
		System.out.println(dataOne+" is first element and "+dataTwo+" is second element");
	}
}
