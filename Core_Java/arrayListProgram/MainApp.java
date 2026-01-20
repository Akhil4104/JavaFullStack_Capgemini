package arrayListProgram;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		//custom 
		ArrayList students=new ArrayList();
		students.add(new Student("Rahul",111));
		students.add(new Student("Shraddha",123));
		System.out.println(students);
	}

}
