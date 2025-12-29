package ObjectProgram;

public class MainApp {

	public static void main(String[] args) {
		System.out.println(new Demo1());
		//reference variable
		Demo1 d=new Demo1();
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1();
		System.out.println(d);
		
		d.title="Java";
		d.price=2000;
		d1.title="C++";
		d1.price=3000;
		d2.title="JavaScript";
		d2.price=5000;
		
		
		System.out.println(d.title);
		System.out.println(d.price);
		System.out.println(d1.title);
		System.out.println(d1.price);
		System.out.println(d2.title);
		System.out.println(d2.price);
	}

}
