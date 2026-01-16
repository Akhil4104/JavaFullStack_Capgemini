package wrapperClass;

public class UnBoxingEx {

	public static void main(String[] args) {
		//Boxing
		int a=10;
		Integer i=Integer.valueOf(a);
		
		//unBoxing
		int b=i.intValue();
		System.out.println(b);
		
		Byte x=50;
		Byte y=Byte.valueOf(x);
		byte z=y.byteValue();
		System.out.println(z);
		
		//AutoBoxing
		int s=77;
		Integer d=s;
		int f=d;
		System.out.println(f);
		
		double t=20.25;
		Double i2=Double.valueOf(t);
		double i3=i2.doubleValue();
		System.out.println(i2);
		System.out.println();	
	}
}
