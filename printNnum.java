//Find Natural Number for N Value input from User.

import java.util.Scanner;

public class printNnum {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the value for the N Number ");
		int n=r.nextInt();
		System.out.print("\nThe N Number are ");
		for (int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}

	}

}
