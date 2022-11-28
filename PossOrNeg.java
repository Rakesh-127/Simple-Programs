//Java program to check number is Positive or Negative
import java.util.Scanner;
public class PossOrNeg {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Please Enter Number to Check Postive or Negative: ");
		int a=r.nextInt();
		
		//Condtioon to check Postive or Negative Number
		if(a<0) {
			System.out.println("The Entered Number "+a+" is Negative");
		}
		if(a==0) {
			System.out.println("The Entered Number "+a+" is Neither Postive or Negative");
		}
		else {
			System.out.println("The Entered Number "+a+" is Positive");
		}

	}

}
