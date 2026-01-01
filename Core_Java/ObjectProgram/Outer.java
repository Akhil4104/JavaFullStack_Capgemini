package ObjectProgram;

public class Outer {
	static class Inner{
		static void display() {
			System.out.println("Static-Method");
		}
		void test() {
			System.out.println("Non-Static Method");
		}
	}
}
