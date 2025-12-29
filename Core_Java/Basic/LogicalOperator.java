class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int n=15;
		if(n%3==0 && n%5==0){
			System.out.println(n+" Is Divisible by 3 and 5");
		}
		else if(n%3==0){
			System.out.println(n+" Is Divisible by 3");
		}
		else if(n%5==0){
			System.out.println(n+" Is Divisible by 5");
		}
		else{
			System.out.println(n+" Is not Divisible by 3 and 5");
		}

		String result =(n % 3 == 0 && n % 5 == 0) ? "Is Divisible by 3 and 5" :(n % 3 == 0) ? "Is Divisible by 3" :(n % 5 == 0) ? "Is Divisible by 5" :"Is not Divisible by 3 and 5";
		System.out.println(result);


	}
}
