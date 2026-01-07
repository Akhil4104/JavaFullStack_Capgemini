package inheritance_Practice;

public class Manager extends Employee{
	String department;
	Manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}
	public void display(){
		System.out.println("Employee name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}
}
