class Typecast 
{
	public static void main(String[] args) 
	{
		// Narrowing (Explicit)
        long c = 50;
        int b = (int) c;  
        System.out.println(b);

        int x = 130;
        byte y = (byte) x;
        System.out.println(y); 
	}
}
