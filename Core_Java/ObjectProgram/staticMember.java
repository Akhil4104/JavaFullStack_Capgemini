package ObjectProgram;

public class staticMember {
	static int a;
	public static void m1() {
		System.out.println("static-method");
	}
	public static void main(String args[]) {
		m1();//method signature
		staticMember.m1();
		System.out.println(staticMember.a);
		
	}
}
