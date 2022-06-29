package may.rishi.sadham.RishiSadhamJava.methods;

public class MethodTypes {
	public static void main(String[] args) {
		MyPark park=new MyPark();
		//park.data="Salem Corporation";
		park.setData("Salem Corporation");
		
		//System.out.println(park.data);
		
		String received=park.getData();
		System.out.println("What i received from "+received);
		
		park.doSome();
		
		char got=park.extract(2);
		System.out.println(got);
	}
}

class MyPark{
	private String data;
	
	// no param and return
	public String getData() {
		return data;
	}
	
	// param and no return
	public void setData(String users) {
		this.data=users;
		System.out.println("value has set");
	}
	
	// no param and no return
	public void doSome() {
		System.out.println("Your "+data+" gonna change as bytes like this "+data.getBytes());
	}
	
	// param and return
	public char extract(int position) {
		return data.charAt(position);
	}
}