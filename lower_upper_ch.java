//Java program to convert character uppercase to lowercase and vice - versa

import java.util.Scanner;
public class lower_upper_ch {

	public static void main(String[] args) {
		
		char ch,ch2;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the Character ");
		ch=r.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			ch2=Character.toLowerCase(ch);
			System.out.println("Lower case for the Character is "+ ch2);
		}
		else {
			ch2=Character.toUpperCase(ch);
			System.out.println("Upper case for the Character is "+ ch2);
			
		}
		

	}

}
