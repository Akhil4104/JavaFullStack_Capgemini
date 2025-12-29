class LocalVariable 
{
	//b1
	public static void main(String[] args) 
	{
		int a=5;
		System.out.println(a);
		{
			a=20;
			System.out.println(a);
		}
	}
}
