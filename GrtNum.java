// Find Greater Number from three value provided by user.

import java.util.Scanner;
public class GrtNum {

	public static void main(String[] args) {
		System.out.println("Enter Values for ");
		Scanner ob=new Scanner(System.in);
		System.out.print("A - ");
		int a=ob.nextInt();
		System.out.print("B - ");
		int b=ob.nextInt();
		System.out.print("C - ");
		int c=ob.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The Greatest Number is A = " +a);
		}
			
		else if(b>c) 
				{
						System.out.println("The Greatest Number is B = "+b);
				}
					else
						System.out.println("The Greatest Number is C = "+c);

	}

}
