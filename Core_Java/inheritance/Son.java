package inheritance;

public class Son extends Father{
	String name="son";
	public void display() {
		System.out.println("My Father Name: "+super.name);
		System.out.println("My Name: "+name);
	}
	public static void main(String args[]) {
		Son s1=new Son();
		s1.display();
		
	}
	
}
