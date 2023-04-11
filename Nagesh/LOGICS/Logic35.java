class Logic35
{
 static void add(int a)
	{
	 System.out.println(a+20);
	}
    static void foo(int x)
	{
	 add(x);
	}
	public static void main (String []args)
	{
		foo(10);
	}
}