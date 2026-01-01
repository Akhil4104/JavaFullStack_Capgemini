package ObjectProgram;

class Bottle{
	
}

public class MainApp2 {
	public static void main(String[] args) {
		Box b1=new Box(1,2);
		printRef(b1);
		Bottle b2=new Bottle();
		printRef(b2);

	}
	public static void printRef(Box b1) {
		System.out.println(b1);
	}
	public static void printRef(Bottle b2) {
		System.out.println(b2);
	}
}
