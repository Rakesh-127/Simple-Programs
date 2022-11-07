//ASCII of Character provided by user.
//ASCII value are value assigned to character

import java.util.Scanner;
public class Asciivalue {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Please entert the Character ");
		char ch=r.next().charAt(0);
		int a=ch;					//int will bydefault convert character into ASCII Value
		System.out.println("The ASCII Value for Character "+ch+" is "+a);

	}

}
