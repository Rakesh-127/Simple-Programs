//Right Triangle Pattern

public class PatternRightTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {					//Rows
			for(int j=i;j<5;j++) {				//Space
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {				//Column
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}

//Opposite Right Triangle Pattern
//public class PatternRightTriangle {
//	public static void main(String[] args) {
//		for(int i=5;i>=0;i--) {
//			for(int j=i;j<5;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//
//	}
//
//}