//Java program to find biggest element in array 

import java.util.Scanner;
public class ArrayBiggestNum {

	public static void main(String[] args) {
		int temp=0;
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter 5 Value in Array: ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nThe Biggest Number in the Array is: ");
		System.out.print(a[0]);
		
		//Efficient way
		
//		int a[]=new int[5];
//		Scanner r=new Scanner(System.in);
//		System.out.print("Enter 5 Value in Array: ");
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=r.nextInt();
//		}
//		
//		int big=a[0];				//take 1st Index of array as 2nd variable to compare rest of array element instead of nested loop.
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>big) {
//				big=a[i];
//			}
//		}
//		
//		System.out.print("\nThe Biggest Number in the Array is: "+big);
		

	}

}
