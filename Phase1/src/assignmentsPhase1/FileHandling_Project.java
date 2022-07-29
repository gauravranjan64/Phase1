package assignmentsPhase1;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class FileHandling_Project {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[60];
		System.out.println("Write data below: ");
		String data=sc.nextLine();	
			try{
				FileWriter writeObj=new FileWriter("D://Test//PracticeProject.txt");
				//Write operation
				writeObj.write(data);
				System.out.println("Write operation done!");
				
				//Append operation
				System.out.println("Write something to check append operation!");
				String appendData=sc.nextLine();
				writeObj.append(appendData);
				
				writeObj.close();
				
				//Read operation
				FileReader readObj=new FileReader("D://Test//PracticeProject.txt");
				readObj.read(ch);
				System.out.println("Data to be read!");
				System.out.println(ch);
				readObj.close();
			}catch(IOException e){
				e.getStackTrace();
			}
	}

}
