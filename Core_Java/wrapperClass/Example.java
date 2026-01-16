package wrapperClass;

public class Example {

	public static void main(String[] args) {
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println(a);
		
		byte b=Byte.parseByte(s);
		System.out.println(b);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		long l=Long.parseLong(s);
		System.out.println(l);
		
		boolean b1=Boolean.parseBoolean(s);
		System.out.println(b1);
		
		short s1=Short.parseShort(s);
		System.out.println(s1);
	}

}
