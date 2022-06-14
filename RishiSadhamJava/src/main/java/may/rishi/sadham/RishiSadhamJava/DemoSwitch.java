package may.rishi.sadham.RishiSadhamJava;

import java.util.Scanner;

// float and double not supported

public class DemoSwitch {
	public static void main(String[] args) {
		System.out.println("Welcome to Anita Enterprises");
		Scanner scan=new Scanner(System.in);
		String usage="", brand="";int gpu=0, price=0;
		
		System.out.println("Tell us usage of the laptop ");
		usage=scan.next();//IT
		
		switch(usage)
		{
		case "it":case "IT":
			System.out.println("You have asked for IT professional usage");break;
		case "accounts":System.out.println("You have asked for Accounts purpose");break;
		case "gamers":case "vfx":System.out.println("You need GPU for high performance");
			// if usage is vfx or gamers we proceed to ask gpu
			System.out.println("Tell us GPU capacity ");
			gpu=scan.nextInt();
			switch(gpu)
			{
			case 2:System.out.println("2GB Nvidia GPU available in SONY/ Lenovo");break;
			case 4:System.out.println("4GB Intel ATI / Nvidia GPU available in DELL/ SONY");break;
			case 8:System.out.println("8GB Nvidia GPU available in HP/ Acer");
				// if 8gb gpu we'll ask for price ranges
				System.out.println("Tell us price ");
				price=scan.nextInt();
				if(price>=51000&&price<=80000) 
					System.out.println("ACER laptops available");
				else if(price>=80001&&price<=124000)
					System.out.println("HP laptops available");
				else
					System.out.println("Nothing matched for "+price);
				break;
			case 16:System.out.println("16GB Nvidia available in HP/ Sony");
				// if gpu is 16 we proceed to ask brand
				System.out.println("Tell us brand ");
				brand=scan.next();
				switch(brand)
				{
				case "HP":case "hp":System.out.println("HP laptops available between 58000 to 81000");break;
				case "sony":System.out.println("Sony available between 82000 to 134000");break;
				default:System.out.println("Invalid brand "+brand);
				}
				break;
			default:System.out.println("No laptop matched with GPU of "+gpu);
			}
			break;
		default:System.out.println("You can use basic configuration");
		}
		
		scan.close();
	}
}


/*
 * Looping statements:

reduce space and time complexity

repeatation: 
	start			initialization
	step up		iteration
	end			condition

// init
while(cond)
{
	// true/ repeat block
	// iter
}

//init
do
{
	// true/repeat block
	// iter
}while(cond);

for(init;cond;iter)
{
	// true/repeat block
}

forEach:

for(type temp:source)
{
	//true/ repeat block
}

*/
