//Java program to arrange array elements in descending order

import java.util.Scanner;
public class ArrayDescending {

	public static void main(String[] args) {
		int temp=0;
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter 5 Value for Array: ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			//Using Nested for loop to compare and check for smaller number between 1st Index number and 2nd Index number.
			for(int j=i+1;j<a.length;j++) {		//i+1, bcoz to compare 1st Index with 2nd Index.
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];		//Swaping array number.
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\nDescending Order Array are: ");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}

	}

}
