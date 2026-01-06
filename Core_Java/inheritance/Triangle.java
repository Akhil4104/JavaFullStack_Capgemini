package inheritance;

public class Triangle extends Shape{
	public void display() {
		System.out.println(shape1);
	}
	public static void main(String args[]) {
		Triangle s=new Triangle();
		s.display();
	}
}
