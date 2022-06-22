package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

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
     
Pascal triangle:
     #
    # #
   # # #
  # # # #
 # # # # #
 
 # # # # #
  # # # #
   # # #
    # #
     #
pyramid:
     #
    ###
   #####
  #######
  
  #######
   #####
    ###
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
		
		
//		for(int row=1;row<=5;row++) {
//			// 4,3,2,1 ; 4,3,2; 4,3; 4
//			for(int space=4;space>=row;space--) {
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
		Scanner myRead=new Scanner(System.in);
		System.out.println("Tell us limit of the pattern ");
		int myLimit=myRead.nextInt();
		
//		for(int row=1;row<=myLimit;row++) {
//			// 4,3,2,1 ; 4,3,2; 4,3; 4
//			for(int space=myLimit-1;space>=row;space--) {
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
//		for(int row=1;row<=myLimit;row++) {
//			// 4,3,2,1 ; 4,3,2; 4,3; 4
//			for(int space=myLimit-1;space>=row;space--) {
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++) {
//				System.out.print("# ");
//			}
//			System.out.println();
//		}
		
		int decide=1;
		for(int row=1;row<=myLimit;row++) {
			// 4,3,2,1 ; 4,3,2; 4,3; 4
			for(int space=myLimit-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=decide;col++) {
				System.out.print("#");
			}
			System.out.println();
			decide+=2;
		}
		
		myRead.close();
	}
}
