package coreJava;

abstract class Main{
	public void hello(){
		System.out.println("Hello World!");
	}
}
public class AbstractClassExample extends Main{

	public static void main(String[] args) {
		AbstractClassExample obj=new AbstractClassExample();
		obj.hello();

	}

}
