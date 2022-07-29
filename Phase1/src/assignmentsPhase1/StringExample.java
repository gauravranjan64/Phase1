package assignmentsPhase1;

public class StringExample {

	public static void main(String[] args) {
		String t="Delhi";
		String o="Mumbai";
		String k="Delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		
		if(o.equals(l) ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(t==k){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		if(y.equals(l) ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(y == l){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		if(t.equals(o) ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(t==o){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		if(k.equals(y) ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(k==y){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		if(p.equals(y) ){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(p==y){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
