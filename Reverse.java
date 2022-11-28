//Java program to Reverse a Number

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter Number to Reverese: ");
		int a=r.nextInt();
		
		//While Loop to reverse number
		System.out.println("\nThe Reveresed Integer for the Given Number by user is: ");
		while(a>0)
		{
			int b=a%10;						//reminder of the input number i.e last number of the given number
			System.out.print(b);			//Print last number obtain from modular operator
			a=a/10;							/*reducing number length, by shifting decimal point to left if 123.0 it will become 12.3. hence in next loop modular will go for 12  
											as integer only take number without decimal and next loop will go for modular 12 and  give reminder 1.*/
			
		}
	}

}
