package assignmentsPhase1;
import java.util.*;

public class ImplementationOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array below!");
		int n=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n];
		System.out.println("Enter  String of Elements: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLine();
		}
		System.out.println("Array elements: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
