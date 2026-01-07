package Has_A_Practice;

public class Engine {
	String engineType;
	int horsePower;
	Engine(String engineType,int horsePower){
		this.engineType=engineType;
		this.horsePower=horsePower;
	}
	void display() {
		System.out.println("Engine Type: "+engineType);
		System.out.println("Horse Power: "+horsePower+"HP");
	}
}
