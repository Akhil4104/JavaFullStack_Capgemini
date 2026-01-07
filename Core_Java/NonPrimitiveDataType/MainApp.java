package NonPrimitiveDataType;

public class MainApp {

	public static void main(String[] args) {
		//upcasting
		A a= new D();
		
		//downcasting
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
		System.out.println(a instanceof B);
		
		if(a instanceof B) {
			B b=(B)a;
		}
		else {
			System.out.println("Don't have instance of this");
		}
	}
}
