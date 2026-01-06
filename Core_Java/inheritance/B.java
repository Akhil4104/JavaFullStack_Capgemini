package inheritance;

public class B extends A{
	public void display() {
		System.out.println(a);
	}
	public static void main(String[]args) {
		System.out.println(a);
		A b=new B();
		b.display();
		/*display();     Cannot make a static reference to the non-static method display() from the type B*/
	}
}
