package inheritance;

public class Rectangle extends Triangle{
	public void display() {
		System.out.println(shape2);
	}
	public static void main(String args[]) {
		Rectangle s=new Rectangle();
		s.display();
	}
}
