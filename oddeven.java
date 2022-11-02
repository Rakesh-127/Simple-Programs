// Odd Even Number

import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Number ");
		int a=r.nextInt();
		if(a%2==0) {
			System.out.println("The Given Number "+a+" is Even");
		}
		else {
			System.out.println("The Given Number "+a+" is Odd");
		}
	
	}

}
