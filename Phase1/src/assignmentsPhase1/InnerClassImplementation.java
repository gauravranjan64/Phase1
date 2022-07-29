package assignmentsPhase1;

class Bike{
	int price=70000;
	
	class Honda{
		int price=40000;
		void getPrice(){
			System.out.println("Honda Price: "+price);
		}
	}
	
	void method(){
		class Bajaj{
			int price=60000;	
		}
		Bajaj obj=new Bajaj();
		
		System.out.println("Bajaj Price: "+obj.price);
		System.out.println("Bike price: "+price);
	}
}
public class InnerClassImplementation {

	public static void main(String[] args) {
		Bike b=new Bike();
		Bike.Honda honda=b.new Honda();
		honda.getPrice();
		b.method();

	}

}
