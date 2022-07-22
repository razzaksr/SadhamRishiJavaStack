package may.rishi.sadham.RishiSadhamJava.oop;

public class Encapsulation {
	public static void main(String[] args) {
		Games gm1=new Games("Smackdown pain","entertainment","PS2,PC",2004);
		//gm1.name="God Hand";
//		gm1.type="Arcade";
//		gm1.devices="PlayStation2, PC";
//		gm1.year=2010;
//		gm1.setName("God Hand");
//		//gm1.setDevices("Playstation2, PC");
//		gm1.setType("Arcade");
//		gm1.setYear(2010);
		System.out.println(gm1.getName()+" "+gm1.getDevices()+" "+gm1.getType()+" "+gm1.getYear());
		
		Games gm2=new Games();
		gm2.setDevices("Playstation3, PC");gm2.setName("God of war 4");gm2.setType("Arcade");
		gm2.setYear(2015);
		//System.out.println(gm2.getDevices()+" "+gm2.getName()+" "+gm2.getType()+" "+gm2.getYear());
		System.out.println(gm2);
		
	}
}

// encapsulated/ model/ business class
class Games{
	private String name;
	private String type;
	private String devices;
	private int year;
	
	@Override
	public String toString() {
		return "Games [name=" + name + ", type=" + type + ", devices=" + devices + ", year=" + year + "]";
	}

	// default
	public Games() {
		System.out.println("Enjoy the games");
	}
	
	// parameterized constructor
	public Games(String name, String type, String devices, int year) {
		this.name = name;
		this.type = type;
		this.devices = devices;
		this.year = year;
	}

	public Games(int year, String name, String type, String devices) {
		this.name = name;
		this.type = type;
		this.devices = devices;
		this.year = year;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDevices() {
		return devices;
	}
	public void setDevices(String devices) {
		this.devices = devices;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//setter
	public void setName(String name) {
		this.name=name;
	} 
	//getter
	public String getName() {
		return name;
	}
}