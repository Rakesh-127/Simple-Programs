//Java program to find average of an array elements

import java.util.Scanner;
public class ArrayAvg {

	public static void main(String[] args) {
		double sum=0;
		double avg;
		int a[]=new int[4];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter 4 Value for Array: ");
		
		for(int i=0; i<a.length;i++) {
			a[i]=r.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		avg=sum/a.length;
		System.out.println("\nAverage for the array is: "+avg);

	}

}
