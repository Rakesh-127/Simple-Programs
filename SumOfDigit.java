//Java program to find Sum of Digits

import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a=r.nextInt();
		
		//While Loop for sum of the number
		int sum=0;
		while(a>0) {
			int b=a%10;		//take reminder from the Number provide by user
			sum=sum+b;		//Store reminder from modular operator and add to variable "sum" and add every time loop run.
			a /=10;			//shift decimal to left.
		}
		System.out.println("The Sum of the Number is: "+sum);

	}

}
