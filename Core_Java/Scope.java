class Scope 
{
	public static int c=15;
	public static void main(String[] args) 
	{
		final int a=5;
		System.out.println(a);
		a=30;
		System.out.println(a);
		res();
	}
	public static void res(){
		int b=6;
		System.out.println(b);
		System.out.println(c);
	}
}
