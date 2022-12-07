//Java program to find length of array

import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter 5 Value in Array: ");
		
		//Array Input
		for (int i=0; i<a.length;i++) {
			a[i]=r.nextInt();
		}
		
		//Print Array
		System.out.print("\nValue in Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		//Array Length
		System.out.print("\nArray Length: ");
		
			System.out.print(a.length);
		

	}

}
