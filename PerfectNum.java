//Java program to check weather a number is Perfect or Not

import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Number for Perfect Number: ");
		int a=r.nextInt();
		int per=0;
		for (int i=1; i<a; i++) {
			if (a%i==0) {
				per+=i;
			}
		}
		if(a==per) {
			System.out.println("is perfect number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
	}

}
