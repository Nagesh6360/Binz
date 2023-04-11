class Logic70
{
 static int y=10;
 static int x=5;
  public static void main (String []args)
 {
  goo(5);
  foo(x+2);
 }
 static void goo(int x)
 {
  foo(x);
  System.out.println(x+y);
 }
 static void foo(int x)
 {
  x=5;
  System.out.println(x);
 }
}
