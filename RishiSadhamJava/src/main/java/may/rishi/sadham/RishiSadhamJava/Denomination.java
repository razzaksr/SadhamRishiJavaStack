package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

public class Denomination {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mac2000s=3,mac500s=10,mac200s=10,mac100s=10,required=0, available=0, currencyCount=0;
		
		String denom="";
		
		available=(mac2000s*2000)+(mac500s*500)+(mac200s*200)+(mac100s*100);
		
		System.out.println("Tell us required cash ");
		required=scan.nextInt();
		
		if(required<=available){
			
			// 2000s
			if(mac2000s>0){
				currencyCount=required/2000;// 15000/2000 >> 7, 4500/2000>> 2
				
				if(currencyCount<=mac2000s) {
					required-=(currencyCount*2000);
					denom+="2000 X "+currencyCount+"\n";// 2000 X 2
					mac2000s-=currencyCount;// 3-2 >> 1
				}
				else {
					required-=(mac2000s*2000);
					denom+="2000 X "+mac2000s+"\n";// 2000 X 3
					mac2000s=0;
				}
			}
			
			if(required>0&&mac500s>0){
				currencyCount=required/500;// 15000/2000 >> 7, 4500/2000>> 2
				
				if(currencyCount<=mac500s) {
					required-=(currencyCount*500);
					denom+="500 X "+currencyCount+"\n";// 2000 X 2
					mac500s-=currencyCount;// 3-2 >> 1
				}
				else {
					required-=(mac500s*500);
					denom+="500 X "+mac500s+"\n";// 2000 X 3
					mac500s=0;
				}
			}
			
			if(required>0&&mac200s>0){
				currencyCount=required/200;// 15000/2000 >> 7, 4500/2000>> 2
				
				if(currencyCount<=mac200s) {
					required-=(currencyCount*200);
					denom+="200 X "+currencyCount+"\n";// 2000 X 2
					mac200s-=currencyCount;// 3-2 >> 1
				}
				else {
					required-=(mac200s*200);
					denom+="200 X "+mac200s+"\n";// 2000 X 3
					mac200s=0;
				}
			}
			
			if(required>0&&mac100s>0){
				currencyCount=required/100;// 15000/2000 >> 7, 4500/2000>> 2
				
				if(currencyCount<=mac100s) {
					required-=(currencyCount*100);
					denom+="100 X "+currencyCount+"\n";// 2000 X 2
					mac100s-=currencyCount;// 3-2 >> 1
				}
				else {
					required-=(mac100s*100);
					denom+="100 X "+mac100s+"\n";// 2000 X 3
					mac100s=0;
				}
			}
			
			if(required>0) {
				System.out.println("Denomination is invalid");
				mac2000s=3;mac500s=10;mac200s=10;mac100s=10;
			}
			else
				System.out.println(denom);
			
		}
		else {
			System.out.println(required+" amount unavailable");
		}
		
		scan.close();
	}
}
