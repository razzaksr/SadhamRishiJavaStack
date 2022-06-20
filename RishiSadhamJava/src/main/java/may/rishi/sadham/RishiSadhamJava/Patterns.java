package may.rishi.sadham.RishiSadhamJava;

/*
 Perfect square
 
 12345
 678910
 1112131415
 1617181920
 2122232425
 
 
 floyds:
 left upper:
 #
 ##
 ###
 ####
 #####
 
 right upper:
 	 #
    ##
   ###
  ####
 #####
 
 
 left lower:
 #####
 ####
 ###
 ##
 #
 
 right lower:
 #####
  ####
   ###
    ##
     #
 
 */

public class Patterns {
	public static void main(String[] args) {
		//int number=1;
		char alpha='A';
//		for(int row=1;row<=5;row++) {
//			for(int col=1;col<=5;col++,alpha++) {
//				System.out.print(alpha);
//			}
//			System.out.println();
//		}
		
//		for(int row=1;row<=5;row++) {
//			for(int col=1;col<=row;col++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
		
		for(int row=1;row<=5;row++) {
			// 4,3,2,1 ; 4,3,2; 4,3; 4
			for(int space=4;space>=row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
