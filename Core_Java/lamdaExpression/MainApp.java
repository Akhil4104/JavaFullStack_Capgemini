package lamdaExpression;

public class MainApp {

	public static void main(String[] args) {
		A a=()->{
			System.out.println("Hi");
			System.out.println("Hello");
		};
		a.test();
		B b=(x,y)->{
			return x+y;
		};
		System.out.println(b.add(10,20));

	}

}
