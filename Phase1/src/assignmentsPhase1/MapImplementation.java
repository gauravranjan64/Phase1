package assignmentsPhase1;
import java.util.*;

public class MapImplementation {

	public static void main(String[] args) {
		System.out.println("------HashMap------");
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
		hMap.put(101, "Gaurav");
		hMap.put(102, "Shivam");
		hMap.put(103, "Sam");
		hMap.put(104, "John");
		for(Map.Entry map:hMap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		System.out.println("------TreeMap------");
		TreeMap<Integer,String> tMap=new TreeMap<Integer,String>();
		hMap.put(101, "Rohan");
		hMap.put(102, "Josh");
		hMap.put(103, "Sameer");
		hMap.put(104, "Jacob");
		for(Map.Entry map:tMap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());	
		}
		System.out.println("------HashTable------");
	}

}
