package Has_A_Practice;

public class Car {
	String model;
	// Composition
	private final Engine engine;
	Car(String model,String engineType,int horsePower){
		this.model=model;
		this.engine=new Engine(engineType,horsePower);
	}
	void display() {
		System.out.println("Car Model: "+model);
		engine.display();
	}
}
