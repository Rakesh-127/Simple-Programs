//Box Pattern

public class PatternBox {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {							//Rows
			for(int j=1;j<=5;j++) {						//Column
				if(i==1 || i==5 ||j==1 || j==5) {		//To give Space Between Columns
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println("\n");
		}

	}

}
