class Logic71
{
  public static void main (String []args)
 {
  goo(5);
  foo(5,3);
 }
 static void goo(int x)
 {
  int y=x+x;
  System.out.println(y);
 }
 static void foo(int a,int b)
 {
  int c=a*b;
  goo(c);
 }
}
