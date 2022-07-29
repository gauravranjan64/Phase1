package assignmentsPhase1;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Started Java");
		
		s.append(" Phase1");
		System.out.println(s);
		
		s.delete(2, 5);
		System.out.println(s);
		
		s.replace(5, 9, "Python");
		System.out.println(s);
		
		s.insert(4, " language");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		StringBuffer sb1 = new StringBuffer("Hello");
		 StringBuffer sb2 = new StringBuffer("Hello");
		 System.out.println(sb1.equals(sb2));
		 
		
		
		System.out.println(s.charAt(9));

	}

}
