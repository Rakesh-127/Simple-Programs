//Java program to check Number is Palindrome or Not 

import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Please Enter the Number to Check If Palindrom or not: ");
		int a=r.nextInt();
		int c=a;
		
		//Loop to check the Palindrom
		int pal=0;
		while(c>0) {
			int b=c%10;
			pal=(pal*10)+b;			//Formula to find Palindrom. This formula Stores reversed value. 
			c/=10;
		}
		System.out.println(+pal);
		if (pal==a) {
			System.out.println("The enter Number "+a+" is Palindrom");
		}
		else {
			System.out.println("The enter Number "+a+" is not Palindrom");
		}

		
	}

}
