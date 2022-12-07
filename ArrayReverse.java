import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter 5 Value In array: ");
		
		//To take Input in array from user
		for (int i=0;i<a.length; i++) {
			a[i]=r.nextInt();
		
		}
		
		//To print the array
		System.out.println("\nValues Added in Array:");
		for (int i=0;i<a.length; i++) {
		System.out.print(a[i]+" ");
		}
		
		//To print Array in Reverse
		System.out.println("\nValues Reversed in Array:");
		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		

	}

}
