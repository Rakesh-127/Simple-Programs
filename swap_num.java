import java.util.Scanner;
public class swap_num {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the two Number to Swap ");
		int a=r.nextInt();
		int b=r.nextInt();
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("The Swaped number are "+a+" and " +b);
		

	}

}
