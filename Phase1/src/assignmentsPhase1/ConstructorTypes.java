package assignmentsPhase1;

public class ConstructorTypes {
	String name;
	int age;
	ConstructorTypes(){
		System.out.println("Inside default Constructor!");
	}
	ConstructorTypes(String name,int age){
		System.out.println("Inside parameterized constructor");
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Name: "+name+"\n"+"Age: "+age);
	}
	public static void main(String args[]){
		ConstructorTypes c1=new ConstructorTypes();
		ConstructorTypes c2=new ConstructorTypes("Gaurav",23);
		
		c2.display();
	}
}
