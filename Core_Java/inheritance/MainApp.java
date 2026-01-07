package inheritance;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		/*Student s1=new Student("Om",1);
		System.out.println(s1.name);*/
		Person p1=new  Student("Om",1);
		//downcasting
		Student s1=(Student)p1;
		System.out.println(s1.name);
		System.out.println(s1.id);

	}

}
