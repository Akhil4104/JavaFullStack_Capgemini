package inheritance_Practice;

public class HierarchicalDemo {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Shape s=new Rectangle();//upcasting
		c.draw();
		r.draw();
		s.draw();

	}

}
