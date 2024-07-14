import java.util.*;

class Student{
	int roll;
	String name;
	int marks;
	
	public void setData(int r, String n, int m){
		roll = r;
		name = n;
		marks = m;
	}
	
	public void getData(){
		System.out.println("Roll No: " + r);
		System.out.println("Name: " + n);
		System.out.println("Marks: " + m);
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		int r = sc.nextInt();
		System.out.println("Enter Name: ");
		String n = sc.next();
		System.out.println("enter Marks: ");
		int m = sc.nextInt();
		
		Student s = new Student();
		s.setData(r, n, m);
		s.getData();
	}
}
