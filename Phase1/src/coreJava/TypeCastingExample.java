package coreJava;

public class TypeCastingExample {

	public static void main(String[] args) {
		float f = 32.6f;
		long l=(long)f;
		System.out.println("Long from float: "+l);
		
		double d=102.2;
		long l1=(long)d;
		int i=(int)l1;
		char c=(char)i;
		System.out.println("char from double->long->int->char: "+c);
		
		long l2=3658462412L;
		byte b=(byte)l2;
		System.out.println("byte from long: "+b);
		
		int i1=21;
		double d1=(double)i1;
		long l3=(long)d1;
		System.out.println("long from int->double->long: "+l3);
		
		
				

	}

}
