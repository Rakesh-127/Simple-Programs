//Java program to insert element in an array

import java.util.Scanner;
public class ArrayAddElement {

	public static void main(String[] args) {
		int size=0, loc=0, value=0;
		
		Scanner r=new Scanner(System.in);
		
		
		System.out.print("Enter size: ");
		size=r.nextInt();
		int a[]=new int[size+1];
		
		System.out.print("Enter Value for Array: ");
		
		for(int i=0;i<size;i++) {
			a[i]=r.nextInt();
		}
		
		//New Array Element
		System.out.print("\nEnter Location for new Array: ");
		loc=r.nextInt();
		System.out.print("Enter Value for new Array: ");
		value=r.nextInt();
		
		for(int i=size;i>loc;i--) {
			a[i]=a[i-1];				//Empty index Location for value
		}
		
		a[loc]=value;					//Adding Value in the Index
		size++;							//Increasing size of the array as new value in added.
		
		for(int i=0;i<a.length;i++) {
		System.out.print("The New value in the array are: " +a[i]+" ");
		}

	}

}
