class Logic36
{
 static void goo(int x)
	{
	 System.out.println(x+10);
	}
    static void add(int a)
	{
	 int x=90;
	 System.out.println(a+20+x);
	 goo(x);
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