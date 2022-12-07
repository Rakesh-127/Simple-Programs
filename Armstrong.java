//Java program to check number is Armstrong or not

import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Please enter Number to find if it is Armstrong number or not: ");
		int a=r.nextInt();
		int b=a;
		int arm=0;
	
		while(a>0) {
			int c=a%10;
			arm+=c*c*c;
			a/=10;
		}
		if (arm==b) {
			System.out.println("Provided Number "+b+" is Armstrong Number");
		}
		else {
			System.out.println("Provided Number "+b+" is Not Armstrong Number");
		}
		
		//To get Armstrong from 1 to Provided Number by user.
		
//		for (int i=1; i<=a; i++) {
//			int ar=0;
//			int n=i;
//			while(n>0) {
//				int c=n%10;
//				ar+=c*c*c;
//				n/=10;
//			}
//			if (i==ar) {
//				System.out.print(i+" ");
//			}
//			
//		}

	}

}
