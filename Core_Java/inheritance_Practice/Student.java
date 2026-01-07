package inheritance_Practice;

public class Student extends Person{
	int roll_no;
	int marks;
	Student(String name,int age,int roll_no,int marks){
		super(name,age);
		this.roll_no=roll_no;
		this.marks=marks;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll.No: "+roll_no);
		System.out.println("Marks: "+marks);
	}
	
}
