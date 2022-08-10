package assignmentsPhase1;

import java.io.IOException;
import java.util.*;

public class LockerPrivateLtd {

	public static void main(String[] args) throws IOException{
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println();
		System.out.println("\t Welcome to LOCK IT! ");
		System.out.println("\t By, Locker Pvt Ltd. ");
		System.out.println("\t---------**----------");
		System.out.println(" Developer: Gaurav Ranjan \n Role: Full Stack Developer \n");
		
		while(true)
		{
			System.out.println("Please choose one of the following options :");
			System.out.println("1. Show Current Files");
			System.out.println("2. Perform Business Operations");
			System.out.println("3. Exit Application from here");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1: //List function feature to list all files in ascending order.
				BusinessOperations.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. Add a File");
					System.out.println("2. Delete a File");
					System.out.println("3. Search for a File");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
						//Creation of a file takes place
						System.out.println("Enter the name of a file to be created: ");
						String fileCreate = sc.next();
						
						// Calling the function to create the file
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of a file takes place
						System.out.print("Enter the name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						// Calling the function to delete the file
						BusinessOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Enter the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						BusinessOperations.searchFile(fileSearch);
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("\n Invalid choice! please make the correct choice\n");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\n Logging out of the Application!!");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println("\n\n Invalid Input, Select within the range of 1-3\n");
				break;
			
			}
		}

	}

}
