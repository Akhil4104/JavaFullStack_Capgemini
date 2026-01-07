package Has_A_Practice;

public class StudentMain {
	public static void main(String args[]) {
		Address a=new Address("Jalandhar","Punjab","144101");
		Student s=new Student("Rahul",a);
		s.details();
	}
}
