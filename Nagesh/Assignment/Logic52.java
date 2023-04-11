class Logic52
{
  public static void main (String []args)
  {
   mul2();
  } 
 static void mul()
 {
  int a=8;
  System.out.println(a);
 }
 static void mul1()
 {
  int b=20;
  double a=8;
  System.out.println(b*a);
  mul();
 }
 static void mul2()
	{
	 int d=2;
	 int e=5;
	 System.out.println(d*e);
	 mul1();
	}
}