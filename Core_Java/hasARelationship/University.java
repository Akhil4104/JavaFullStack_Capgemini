package hasARelationship;

public class University {
	String university_name;

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	//constructor
	University(){
		
	}
	University(String university_name){
		this.university_name=university_name;
	}
	Department d=new Department("CSE");
}
