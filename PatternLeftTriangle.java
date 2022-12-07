//Left Triangle Pattern

public class PatternLeftTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {				//Rows
			for(int j=1;j<=i;j++) {			//Column
				System.err.print("*");
			}
			System.err.print("\n");
		}

	}

}


// Opposite Left Triangle

//public class PatternLeftTriangle {
//	public static void main(String[] args) {
//		for(int i=5;i>=0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.err.print("*");
//			}
//			System.err.print("\n");
//		}
//
//	}
//
//}
