package ObjectProgram;

public class EncapsulationEx {
	public static void main(String args[]) {
		Outer.Inner.display();
		
		Outer.Inner e1=new Outer.Inner();
		e1.test();
	}
}
