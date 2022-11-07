//Java program to calculate power of a Number

import java.util.Scanner;
public class powerNum {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Please input the Number ");
		int n=r.nextInt();
		System.out.print("Please input Power ");
		int p=r.nextInt();
		System.out.println("The sum for the Number "+n+" Power of "+p+" is");
		for (int i=1; i<p; i++) {
			n=n*n;
		}
		System.out.print(n);

	}

}
