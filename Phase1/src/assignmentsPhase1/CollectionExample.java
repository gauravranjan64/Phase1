package assignmentsPhase1;
import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println();
		
		System.out.println("Vector");
		Vector<String> vlist=new Vector<String>();
		vlist.add("Gaurav");
		vlist.add("Shivam");
		vlist.add("Rohan");
		System.out.println(vlist);
		System.out.println();
		
		System.out.println("LinkedList");
		LinkedList<String> l=new LinkedList<String>();
		l.add("Delhi");
		l.add("Manali");
		l.add("Otty");
		l.add("Sikkim");
		System.out.println(l);
		System.out.println();
		
		System.out.println("HashSet");
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(96);
		set.add(97);
		set.add(32);
		set.add(25);
		System.out.println(set);
		System.out.println();
		
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(15);
		lset.add(45);
		lset.add(63);
		System.out.println(lset);
		
	}

}
