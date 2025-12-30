package Basic;
class Operator 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=10;
		int res=a+b;
		System.out.println(res);
		a=a+5;
		System.out.println(a);
		System.out.println(a==b);
		int c=++a;
		System.out.println(c);
		boolean x=true,y=false;
		System.out.println(x || y);
		System.out.println(10+"Hello"+20);
		System.out.println("Hi"+30+20);
		System.out.println('A'+"Hello");
		System.out.println('A'+5);
		System.out.println('A'*5);

		boolean ans=(a!=b);
		System.out.println(ans);
		System.out.println(a>b?a:b);
		System.out.println(10==10?true:false);
	}
}
