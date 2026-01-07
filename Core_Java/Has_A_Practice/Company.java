package Has_A_Practice;

public class Company {
	String companyname;
	Employee employee;
	Company(String companyname,Employee employee){
		this.companyname=companyname;
		this.employee=employee;
	}
	void display() {
		System.out.println("Company Name: "+companyname);
		System.out.println("Employee Id: "+employee.id);
		System.out.println("Employee Name: "+employee.name);
		System.out.println("Employee Salary: "+employee.salary);
	}
}
