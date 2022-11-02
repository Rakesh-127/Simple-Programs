import java.util.Scanner;
public class SwitchNum {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Value for A - ");
		int a=ob.nextInt();
		System.out.print("Enter Value for B - ");
		int b=ob.nextInt();
		System.out.println("\nThe Value Before Switch are A - "+a+ ", B - "+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\nThe Switched Value are A - "+a+", B - "+b);

		
	}

}
