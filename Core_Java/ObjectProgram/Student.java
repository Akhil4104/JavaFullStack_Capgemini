package ObjectProgram;

public class Student {
	String pan;
	String adhar;
	String voting;
	
	//constructors
	Student(){
		
	}
	Student(String pan){
		this();
		this.pan=pan;
	}
	Student(String pan,String adhar){
		//this.pan=pan;
		this(pan);
		this.adhar=adhar;
	}
	Student(String pan,String adhar,String voting){
		//this.pan=pan;
		//this.adhar=adhar;
		this(pan,adhar);
		this.voting=voting;
	}
}
