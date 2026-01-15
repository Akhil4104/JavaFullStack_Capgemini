package abstractionPractice;

public abstract class Employee {
	String name;
	int EmployeeId;
	Employee(String name,int EmployeeId){
		this.name=name;
		this.EmployeeId=EmployeeId;
	}
	abstract void calculateSalary();
	public void displayDetails() {
		System.out.println("Employee name: "+name);
		System.out.println("Employee Id: "+EmployeeId);
	}
}
