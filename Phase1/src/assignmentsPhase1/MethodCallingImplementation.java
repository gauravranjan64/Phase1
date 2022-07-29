package assignmentsPhase1;

public class MethodCallingImplementation {
	public void method1(){
		System.out.println("Calling Method!");
	}
	public static void main(String[] args) {
		MethodCallingImplementation obj=new MethodCallingImplementation();
		obj.method1(); // 
		System.out.println("===============");
		new MethodCallingImplementation().method1(); 

	}

}
