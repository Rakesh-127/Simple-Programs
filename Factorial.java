// Java program to find Factorial of a Number. USing While Loop.

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Factorial Number ");
		int f=r.nextInt();
		int total=1;
		System.out.println("\nThe Factorial of "+f+" is ");
		while(f!=0) {
			total=total*f;
			f--;
		}
		System.out.println(+total);

	}

}

// Find Factorial By Using for loop.

//import java.util.Scanner;
//public class Factorial {
//
//	public static void main(String[] args) {
//		Scanner r=new Scanner(System.in);
//		System.out.print("Enter the Factorial Number ");
//		int f=r.nextInt();
//		int total=1;
//		System.out.println("\nThe Factorial of "+f+" is ");
//		for (int i=1;i<=f;i++) {
//			total=total*i;
//		}
//		System.out.println(+total);
//
//	}
//
//}