package hasARelationship;

public class Department {
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	//constructor
	Department(){
		
	}
	Department(String deptName){
		this.deptName=deptName;
	}
}
