package coreJava;
import java.util.*;

public class EmailIdVerification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		String id[]=new String[n];
		System.out.println("Enter email id: ");
		for(int i=0;i<n;i++){
			id[i]=sc.nextLine();
		}
		System.out.println("Enter Id to be searched: ");
		String targetId=sc.nextLine();
		
		boolean check=false;
		for(int i=0;i<n;i++){
			if(id[i].equals(targetId)){
				check=true;
				break;
			}
		}
		if(check){
			System.out.println("Id Found");
		}else{
			System.out.println("Id not found");
		}

	}

}
