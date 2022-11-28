//Java program to find factor of a Number

import java.util.Scanner;
public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a=r.nextInt();
		
		//For Loop To get the factor for the Number
		
		for(int i=1; i<=a; i++) {
			if (a%i==0) {
				System.out.print(i+" ");
			}
		}
	
	}

}
