// If the User Input is odd print sum of all number / If input is Even Print sum of all Even Number
import java.util.Scanner;
public class sumoddeven {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Number ");
		int a=r.nextInt();
		int sum=0;
		if (a%2==0) {
			
			for (int i=0; i<=a; i++){
				if(i%2==0) {
				sum=sum+i;	
				}
			}
			System.out.print("The Sum of all Even Number is "+sum);
			}
		else {
			
			for (int i=0; i<=a; i++) {
				if(i%2!=0) {
				sum=sum+i;
				}
			}
			System.out.print("The Sum of all Odd Number is "+sum);
		}

	}
}