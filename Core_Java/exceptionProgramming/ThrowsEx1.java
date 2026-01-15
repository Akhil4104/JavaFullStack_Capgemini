package exceptionProgramming;

public class ThrowsEx1 {
	public static void m1() throws ArithmeticException,NullPointerException {
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public static void m2() {
		try {
			m1();
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
	}

	public static void main(String[] args) {
		m2();
	}

}
