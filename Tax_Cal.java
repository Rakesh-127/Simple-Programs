//Java program to calculate Tax of a Salary

import java.util.Scanner;
public class Tax_Cal {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Salary ");
		int t=r.nextInt();
		if(t<=10000) {
			System.out.println("The Salary after Tax Deduction is "+t);
		}
		else if(t>10000 && t<=100000) {
				double sum=t-(0.1*t);
				System.out.println("The Salary after Tax Deduction is "+sum);
			}
		
		else {
			if(t>100000) {
				double sum=t-(0.2*t);
				System.out.println("The Salary after Tax Deduction is "+sum);
			}
		}
			

	}

}
