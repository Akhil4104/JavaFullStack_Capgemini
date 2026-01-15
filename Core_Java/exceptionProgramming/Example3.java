package exceptionProgramming;

public class Example3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
