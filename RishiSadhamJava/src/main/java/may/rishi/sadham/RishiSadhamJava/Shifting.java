package may.rishi.sadham.RishiSadhamJava;

/*
1024 512 256 128 64 32 16 8 4 2 1
   0   0   0   1  1  0  1 0 0 1 0	-	210	thor
   0   0   0   0  0  1  1 0 1 0 0	-	52
   
   0   0   0   0  0  1  0 1 1 0 1	-	45 banner
   0   1   0   1  1  0  1 0 0 0 0	-	720
   
   8192	4096 2048 1024 512 256 128 64 32 16 8 4 2 1
      0    1    0    1   1   0   1  0  0  0 0 0 0 0		-	5760
      
      += -=
      ^=
      >>=
      <<=

 */

public class Shifting {
	public static void main(String[] args) {
		int thor=210,banner=45;
		
		System.out.println(thor>>2);
		System.out.println(banner<<4);// 720
		System.out.println(banner<<7);// 5760
	}
}
