package coreJava;

public class MethodOverloading {
	
	int calculate(int a,int b){
		return a+b;
	}
	int calculate(int radius){
		return (int)(3.14*radius*radius);
	}
	int calculate(int length,float breadth){
		return length*(int)breadth;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println("Addition of two no: "+obj.calculate(6, 9));
		System.out.println("Area of circle: "+obj.calculate(16));
		System.out.println("Area of rectangle: "+obj.calculate(63, 21.3f));

	}

}
