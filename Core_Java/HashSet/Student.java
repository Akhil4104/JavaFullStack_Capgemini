package HashSet;

public class Student {
	String name;
	int id;
	Student(){
		
	}
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
	    return "Student{name='" + name + "', id=" + id + "}";
	}

}
