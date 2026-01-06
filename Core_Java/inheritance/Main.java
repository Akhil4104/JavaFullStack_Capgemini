package inheritance;

public class Main {

	public static void main(String[] args) {
		ShapeH shape=new ShapeH();
		TriangleH t=new TriangleH(10,5);
		CircleH c=new CircleH(5);
		SquareH s=new SquareH(5);
		shape.area();
		t.area();
		c.area();
		s.area();
	}
}
