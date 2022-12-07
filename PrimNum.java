// Prime Number Input from user

import java.util.Scanner;
public class PrimNum {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Last Number To search for Prime Number ");
		int n=ob.nextInt();
		System.out.println("\nThe Prime Number are");
		for(int i=1; i<=n; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0){
					count++;
					
				}
			}
			if(count==2) {
				System.out.print(i+ " ");
			}
		
		}
		
	}
		
}
		

	
	


