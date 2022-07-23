package phase1.modifier.test;

import coreJava.TestM;

public class TestZ extends TestM{
	public static void main(String args[]){
		new TestZ().protectedMethod();
		System.out.println();
		
		System.out.println("Default varaible of class X: "+ new TestX().age);
		System.out.println("public varaible of class X: "+ new TestX().a);
		System.out.println("Protected varaible of class X: "+ new TestX().c);
	}
	
	
}
