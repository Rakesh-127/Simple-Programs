//Java program to check input year is leap year or not 

import java.util.Scanner;
public class LeepYear {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter Year: ");
		int a=r.nextInt();
		
		//Condition to check if Year is LEep Year or not
		
		if (a%4==0 && a%100!=0 || a%100==0 && a%400==0) {
			System.out.println("The Year Entered is Leep Year");
		}
		else {
			System.out.println("The Year Entered is Not Leep Year");
		}

	}

}
