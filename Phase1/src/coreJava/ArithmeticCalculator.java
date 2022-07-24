package coreJava;
import java.util.*;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers");
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the choice for perticular operation to perform:(+,-,*,/)");
		char s=sc.next().charAt(0);
		switch(s){
			case '+': System.out.println("Addition of numbers: "+(d1+d2)); break;
			case '-': System.out.println("Difference of numbers: "+(d1-d2)); break;
			case '*': System.out.println("Product of numbers: "+(d1*d2)); break;
			case '/': System.out.println("Division of numbers: "+(d1/d2));break;
			default : System.out.println("Invalid expression choice!");
			
		}
		

	}

}
