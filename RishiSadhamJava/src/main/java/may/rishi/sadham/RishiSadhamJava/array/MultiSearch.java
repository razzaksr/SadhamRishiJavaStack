package may.rishi.sadham.RishiSadhamJava.array;

public class MultiSearch {
	
	public void linear(String[][] arr,String data) {
		int row=0;
		while(row<arr.length) {
			int col=0;
			while(col<arr[row].length) {
				if(arr[row][col].equalsIgnoreCase(data)) {
					System.out.println(data+" found @ row "+row+" and column "+col);
					return;
				}
				col++;
			}
			row++;
		}
		System.out.println(data+" isn't found anywhere");
	}
	
	public static void main(String[] args) {
		String[][] myTeam= {
				{"Kaleem","Vikas","Balaji"},
				{"Rishi","Shahid"},
				{"Sadham","Murugan","Richard","Praveen","Jegan"}
				};
		
		MultiSearch mul=new MultiSearch();
		mul.linear(myTeam, "Richard");
		mul.linear(myTeam, "Jegan");
		mul.linear(myTeam, "Vikas");
		mul.linear(myTeam, "Rishi");
		mul.linear(myTeam, "Vinod");
	}
}
