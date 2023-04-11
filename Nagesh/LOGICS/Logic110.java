class Logic110
{
 static int x=5;
 static void loof(int a)
 {
  int b=4;
  x=a+b;
  System.out.println(x);
 }
 static void gotoo(int x1)
	{
  System.out.println(x);
  loof(2);
 }
 public static void main (String []args)
 {
  System.out.println(x);
  gotoo(x+5);
 }
}