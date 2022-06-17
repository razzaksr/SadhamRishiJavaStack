package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class DemoFor {
	public static void main(String[] args) {
		// infinite loop
//		for(;;) {
//			System.out.println("This is For Loop");
//		}
		
//		for(int number=11;number<=10;number++) {
//			System.out.println(number*2);
//		}
		
//		int number=1;
//		for(;number<=10;) {
//			System.out.println(number*2);
//			number+=2;
//		}
		
//		for(int alpha=1,beta=2;alpha<=10&&beta<=10;alpha++,beta++) {
//			System.out.println(alpha*beta);
//		}
		
		//flash sale
		
		Scanner scan=new Scanner(System.in);
		
//		int stock=250;double time=10.01;
//		int userOrder=0,invoice=0;
//		for(;stock>0&&time<=10.60;time+=0.01) {
//			System.out.println("Tell us how many mobiles you wish ");
//			userOrder=scan.nextInt();
//			
//			if(stock>=userOrder) {
//				stock-=userOrder;
//				System.out.println("Invoice generated for "+userOrder+" quantity");
//				invoice++;
//			}
//			else {
//				System.out.println("available only "+stock);
//			}
//		}
//		
//		System.out.println("Totally "+invoice+" bills genrated in this sale");
		
		// stock clearance sale
		int days=5,stock=50, requiredCount=0,userPaid=0;double price=25000.5,userPayabale=0;
		
		for(;stock>0&&days>0;) {
			System.out.println("Today price is "+price);
			System.out.println("Tell us required stock ");
			requiredCount=scan.nextInt();
			if(requiredCount<=stock) {
				userPayabale=requiredCount*price;
				System.out.println("Pay the amount ");
				userPaid=scan.nextInt();
				if(userPaid>=userPayabale) {
					System.out.println(requiredCount+" amount of stock sold");
					stock-=requiredCount;
				}
				else {
					System.out.println("Insufficient to buy "+requiredCount);
				}
			}
			else {
				System.out.println("Only "+stock+" left for sale");
			}
			days--;
			price-=(price*0.100);
		}
		
		System.out.println("Stock available "+stock);
		
		scan.close();
	}
}
