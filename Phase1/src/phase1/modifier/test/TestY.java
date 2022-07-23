package phase1.modifier.test;


import coreJava.TestM;
import coreJava.TestN;


public class TestY extends TestN{
	public static void main(String args[]){
		TestM obj = new TestM();
		TestN obj1 =new TestN();
		
		new TestY().protectedMethod();
		
		obj.publicMethod();
		obj1.publicMethod();
		
		System.out.println();
		
		System.out.println("Default varaible of class X: "+ new TestX().age);
		System.out.println("public varaible of class X: "+ new TestX().a);
		System.out.println("Protected varaible of class X: "+ new TestX().c);
	
	}
}
