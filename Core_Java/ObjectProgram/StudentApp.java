package ObjectProgram;

public class StudentApp {
	public static void main(String args[]) {
		Student s1=new Student();
		Student s2=new Student("XP123");
		Student s3=new Student("XP124","123456");
		Student s4=new Student("XP125","1234567","v123");
		
		System.out.println(s1);
		System.out.println("Pan_Card: "+s2.pan);
		System.out.println("Pan_Card: "+s3.pan+", Adhar_Card: "+s3.adhar);
		System.out.println("Pan_Card: "+s4.pan+", Adhar_Card: "+s4.adhar+", Voting_Card: "+s4.voting);
		
	}
}
