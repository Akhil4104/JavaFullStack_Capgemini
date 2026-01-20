package HashSet;

public class Employee implements Comparable<Employee>{
	int empId;
	String name;
	double salary;
	
	Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee e) {
		return Double.compare(this.salary, e.salary);
	}
	
}
