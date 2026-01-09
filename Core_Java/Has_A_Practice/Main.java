package Has_A_Practice;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Rahul", 50000);
        Company comp = new Company("Tech Solutions", emp);
        comp.display();
	}

}
