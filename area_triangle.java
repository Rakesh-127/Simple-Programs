//Java program to calculate area of Triangle

import java.util.Scanner;
public class area_triangle {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Sides of the Triangle ");
		int a=r.nextInt();
		int b=r.nextInt();
		int c=r.nextInt();
		int par=(a+b+c)/2;
		double ans=Math.sqrt(par*(par-a)*(par-b)*(par-c));
		System.out.println("\nThe Area of the Triangle is "+ans);

	}

}
