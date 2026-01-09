package abstraction;

public class MainApp {
	public static void main(String args[]) {
		Animal a1=new Cat();  //upcasting
		a1.sound();
		a1.walk();
		Dog d=new Dog();
		d.sound();
	}
}
