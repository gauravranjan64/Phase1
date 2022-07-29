package assignmentsPhase1;

public class TestP {

	public static void main(String[] args) {
		new TestM().publicMethod();
		new TestM().defaultMethod();
		new TestM().protectedMethod();
		
		System.out.println("Default varaible of class M: "+ new TestM().age);
		System.out.println("public varaible of class M: "+ new TestM().a);
		System.out.println("Protected varaible of class M: "+ new TestM().c);
		
		System.out.println("======================================================");
		
		new TestN().publicMethod();
		new TestN().defaultMethod();
		new TestN().protectedMethod();
		
		System.out.println("Default varaible of class N: "+ new TestN().age);
		System.out.println("public varaible of class N: "+ new TestN().a);
		System.out.println("Protected varaible of class N: "+ new TestN().c);
	}

}
