package wrapperClass;

public class BoxingEx {

	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		
		int b=20;
		Integer i2=Integer.valueOf(b);  //method static 
		System.out.println(i2);
		
		//AutoBoxing
		int x=30;
		Integer y=x;
		System.out.println(y);
	}

}
