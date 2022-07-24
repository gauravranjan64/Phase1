package coreJava;
import java.util.*;
import java.util.function.Consumer;

 class MyConsumer<T> implements Consumer<T>{

	@Override
	public void accept(T num) {
		System.out.println("Working on no: "+num);
		System.out.println("Result after add 5 to num: "+((int)num+5));
		
	}
	
}

public class UtilityPackagesDemo {

	public static void main(String[] args) {
		MyConsumer obj=new MyConsumer();
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println(list);
		list.forEach(obj);

	}

}
