// Prime Number input from User.
// Prime and Non - Prime Number

import java.util.Scanner;
public class PimeNum {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Last Number To search for Prime Number ");
		int n=ob.nextInt();
		System.out.println("\nThe Prime Number are");
		for(int i=2; i<n; i++) {
			boolean prime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0){
					prime=false;
					
				}
			}
			if(prime) {				// We can also get Non-Prime Number if replace "Prime" with "Prime==false"
				System.out.print(i+ " ");
			}
		
		}

	}

}
