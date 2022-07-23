package coreJava;
class Student{
	int regNo;
	String studentName;
	
	Student(int resgistrationNo,String name){
		this.regNo=resgistrationNo;
		this.studentName=name;
		
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		//Student obj=new Student();
		Student [] arr=new Student[5];
		arr[0]=new Student(101,"Gaurav");
		arr[1]=new Student(102,"Saurav");
		arr[2]=new Student(103,"Rahul");
		arr[3]=new Student(104,"Rohan");
		arr[4]=new Student(105,"shivam");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].regNo+" "+arr[i].studentName);
		}

	}

}
