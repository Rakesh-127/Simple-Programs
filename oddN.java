// Odd number till the N number provided by user

import java.util.Scanner;
public class oddN {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the N number for Odd ");
		int n=r.nextInt();
		System.out.println("The Odd Number for till Number "+n+" are");
		for (int i=1; i<=n; i++) {    
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}

// code can also be written without if statement 
//
//import java.util.Scanner;
//public class oddN {
//
//	public static void main(String[] args) {
//		Scanner r=new Scanner(System.in);
//		System.out.print("Enter the N number for Odd ");
//		int n=r.nextInt();
//		System.out.println("The Odd Number for till Number "+n+" are");
//		for (int i=1; i<=n; i=i+2) {     // 1+2=3, 3+2=5 ....etc
//				System.out.print(i);
//		}
//
//	}
//
//}
