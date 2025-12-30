package ObjectProgram;

public class NonStatic {
	{
		System.out.println("Hi form non-static block");
	}
	NonStatic(){
		System.out.println("Hi from constructor");
	}
	public static void main(String args[]) {
		NonStatic d1=new NonStatic();
	}
}