//Java program to count Digits in a Number

import java.util.Scanner;
public class digit_in_num {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Digit ");
		int d=r.nextInt();
		int count=0;
		while(d>0) {
			d=d/10;
			count++;
			
			
		}
		System.out.println("The Number of Digits in the digit are = "+count);
		

	}

}
